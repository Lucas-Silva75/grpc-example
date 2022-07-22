/* eslint-disable prettier/prettier */
import { Metadata, ServerUnaryCall } from '@grpc/grpc-js';
import { Controller } from '@nestjs/common';
import { GrpcMethod } from '@nestjs/microservices';
import { CpfService } from './cpf.service';
import { CpfRequest } from './interfaces/cpf-request';
import { CpfResponse } from './interfaces/cpf-response';

@Controller()
export class CpfController {
  constructor(private readonly cpfService: CpfService) {}

  @GrpcMethod('CpfService', 'consultarCpf')
  consultarCpf(data: CpfRequest, metadata: Metadata): CpfResponse {

    console.log('cpf: ' + data.cpf);
    
    return this.cpfService.consultarCpf(data.cpf, metadata);
  }
}
