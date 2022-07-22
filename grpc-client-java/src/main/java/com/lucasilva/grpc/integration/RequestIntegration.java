package com.lucasilva.grpc.integration;

import com.lucasilva.grpc.integration.grpc.Cpf;
import com.lucasilva.grpc.integration.grpc.CpfServiceGrpc;
import com.lucasilva.grpc.services.exceptions.IntegrationException;
import io.grpc.*;
import org.springframework.stereotype.Component;

@Component
public class RequestIntegration {

    // criar client para chamada grpc
    public String consultarRestricoesCpf(String cpf) {

        var channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .intercept(authInterceptor())
                .usePlaintext()
                .build();

        var stub = CpfServiceGrpc.newBlockingStub(channel);

        try {
            var cpfRequest = Cpf.CpfRequest.newBuilder().setCpf(cpf).build();

            var cpfResponse = stub.consultarCpf(cpfRequest);
            return cpfResponse.getSituacao();
        } catch (StatusRuntimeException ex) {
            throw new IntegrationException(ex.getMessage());
        }
    }

    public static ClientInterceptor authInterceptor() {
        return new ClientInterceptor() {
            @Override
            public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
                    MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {

                final var call = channel.newCall(methodDescriptor, callOptions);
                return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(call) {
                    @Override
                    public void start(Listener<RespT> responseListener, Metadata headers) {

                        final var token = Metadata.Key.of("token", Metadata.ASCII_STRING_MARSHALLER);

                        headers.put(token, "token vindo do projeto grpc-client-java");

                        delegate().start(responseListener, headers);
                    }
                };
            }
        };
    }

}