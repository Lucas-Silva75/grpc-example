/* eslint-disable prettier/prettier */
import { Metadata, ServerUnaryCall } from '@grpc/grpc-js';
import { Status } from '@grpc/grpc-js/build/src/constants';
import { Controller } from '@nestjs/common';
import { GrpcMethod, RpcException } from '@nestjs/microservices';
import { CpfService } from './cpf.service';
import { CpfRequest } from './interfaces/cpf-request';
import { CpfResponse } from './interfaces/cpf-response';

@Controller()
export class CpfController {
  constructor(private readonly cpfService: CpfService) {}

  @GrpcMethod('CpfService', 'consultarCpf')
  consultarCpf(data: CpfRequest, metadata: Metadata, call: ServerUnaryCall<any, any>): CpfResponse {

    const { token } = metadata.getMap();
    console.log(token);

    if (!token) {
      throw new RpcException({
        code: Status.UNAUTHENTICATED,
        message: 'token is required',
      });
    }

    return this.cpfService.consultarCpf(data.cpf);
  }
}
