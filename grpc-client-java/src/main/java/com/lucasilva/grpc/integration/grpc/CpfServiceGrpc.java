package com.lucasilva.grpc.integration.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: cpf.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CpfServiceGrpc {

  private CpfServiceGrpc() {}

  public static final String SERVICE_NAME = "serasa.CpfService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.lucasilva.grpc.integration.grpc.Cpf.CpfRequest,
      com.lucasilva.grpc.integration.grpc.Cpf.CpfResponse> getConsultarCpfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "consultarCpf",
      requestType = com.lucasilva.grpc.integration.grpc.Cpf.CpfRequest.class,
      responseType = com.lucasilva.grpc.integration.grpc.Cpf.CpfResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lucasilva.grpc.integration.grpc.Cpf.CpfRequest,
      com.lucasilva.grpc.integration.grpc.Cpf.CpfResponse> getConsultarCpfMethod() {
    io.grpc.MethodDescriptor<com.lucasilva.grpc.integration.grpc.Cpf.CpfRequest, com.lucasilva.grpc.integration.grpc.Cpf.CpfResponse> getConsultarCpfMethod;
    if ((getConsultarCpfMethod = CpfServiceGrpc.getConsultarCpfMethod) == null) {
      synchronized (CpfServiceGrpc.class) {
        if ((getConsultarCpfMethod = CpfServiceGrpc.getConsultarCpfMethod) == null) {
          CpfServiceGrpc.getConsultarCpfMethod = getConsultarCpfMethod =
              io.grpc.MethodDescriptor.<com.lucasilva.grpc.integration.grpc.Cpf.CpfRequest, com.lucasilva.grpc.integration.grpc.Cpf.CpfResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "consultarCpf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lucasilva.grpc.integration.grpc.Cpf.CpfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lucasilva.grpc.integration.grpc.Cpf.CpfResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CpfServiceMethodDescriptorSupplier("consultarCpf"))
              .build();
        }
      }
    }
    return getConsultarCpfMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CpfServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CpfServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CpfServiceStub>() {
        @java.lang.Override
        public CpfServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CpfServiceStub(channel, callOptions);
        }
      };
    return CpfServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CpfServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CpfServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CpfServiceBlockingStub>() {
        @java.lang.Override
        public CpfServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CpfServiceBlockingStub(channel, callOptions);
        }
      };
    return CpfServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CpfServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CpfServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CpfServiceFutureStub>() {
        @java.lang.Override
        public CpfServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CpfServiceFutureStub(channel, callOptions);
        }
      };
    return CpfServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CpfServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void consultarCpf(com.lucasilva.grpc.integration.grpc.Cpf.CpfRequest request,
        io.grpc.stub.StreamObserver<com.lucasilva.grpc.integration.grpc.Cpf.CpfResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConsultarCpfMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConsultarCpfMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.lucasilva.grpc.integration.grpc.Cpf.CpfRequest,
                com.lucasilva.grpc.integration.grpc.Cpf.CpfResponse>(
                  this, METHODID_CONSULTAR_CPF)))
          .build();
    }
  }

  /**
   */
  public static final class CpfServiceStub extends io.grpc.stub.AbstractAsyncStub<CpfServiceStub> {
    private CpfServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CpfServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CpfServiceStub(channel, callOptions);
    }

    /**
     */
    public void consultarCpf(com.lucasilva.grpc.integration.grpc.Cpf.CpfRequest request,
        io.grpc.stub.StreamObserver<com.lucasilva.grpc.integration.grpc.Cpf.CpfResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConsultarCpfMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CpfServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CpfServiceBlockingStub> {
    private CpfServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CpfServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CpfServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.lucasilva.grpc.integration.grpc.Cpf.CpfResponse consultarCpf(com.lucasilva.grpc.integration.grpc.Cpf.CpfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConsultarCpfMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CpfServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CpfServiceFutureStub> {
    private CpfServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CpfServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CpfServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lucasilva.grpc.integration.grpc.Cpf.CpfResponse> consultarCpf(
        com.lucasilva.grpc.integration.grpc.Cpf.CpfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConsultarCpfMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONSULTAR_CPF = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CpfServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CpfServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONSULTAR_CPF:
          serviceImpl.consultarCpf((com.lucasilva.grpc.integration.grpc.Cpf.CpfRequest) request,
              (io.grpc.stub.StreamObserver<com.lucasilva.grpc.integration.grpc.Cpf.CpfResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CpfServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CpfServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lucasilva.grpc.integration.grpc.Cpf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CpfService");
    }
  }

  private static final class CpfServiceFileDescriptorSupplier
      extends CpfServiceBaseDescriptorSupplier {
    CpfServiceFileDescriptorSupplier() {}
  }

  private static final class CpfServiceMethodDescriptorSupplier
      extends CpfServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CpfServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CpfServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CpfServiceFileDescriptorSupplier())
              .addMethod(getConsultarCpfMethod())
              .build();
        }
      }
    }
    return result;
  }
}
