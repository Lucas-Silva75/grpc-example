import { Metadata } from '@grpc/grpc-js';
import { Status } from '@grpc/grpc-js/build/src/constants';
import { Injectable } from '@nestjs/common';
import { RpcException } from '@nestjs/microservices';
import { CpfResponse } from './interfaces/cpf-response';

@Injectable()
export class CpfService {
  consultarCpf(cpf: string, metadata: Metadata): CpfResponse {
    const isNumeric = this.isNumeric(cpf);

    if (!isNumeric) {
      throw new RpcException({
        code: Status.INVALID_ARGUMENT,
        message: 'CPF deve conter apenas dígitos',
      });
    }

    const { token } = metadata.getMap();
    console.log('token: ' + token);

    if (!token) {
      throw new RpcException({
        code: Status.UNAUTHENTICATED,
        message: 'Token é requirido',
      });
    }

    const cpfResponse: CpfResponse = {
      situacao: '',
    };

    if (cpf.startsWith('6') || cpf.startsWith('7')) {
      cpfResponse.situacao = 'NEGATIVADO';
    } else {
      cpfResponse.situacao = 'OK';
    }

    return cpfResponse;
  }

  private isNumeric(str: string): boolean {
    if (typeof str !== 'string') {
      return false;
    }

    if (str.trim() === '') {
      return false;
    }

    return !Number.isNaN(Number(str));
  }
}
