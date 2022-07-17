import { Injectable } from '@nestjs/common';
import { CpfResponse } from './interfaces/cpf-response';

@Injectable()
export class CpfService {
  consultarCpf(cpf: number): CpfResponse {
    const cpfString = cpf.toString();

    const cpfResponse: CpfResponse = {
      situacao: '',
    };

    if (cpfString.startsWith('6') || cpfString.startsWith('7')) {
      cpfResponse.situacao = 'NEGATIVADO';
    } else {
      cpfResponse.situacao = 'OK';
    }

    return cpfResponse;
  }
}
