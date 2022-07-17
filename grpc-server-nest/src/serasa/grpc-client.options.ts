import { ClientOptions, Transport } from '@nestjs/microservices';
import { join } from 'path';

export const grpcClientOptions: ClientOptions = {
  transport: Transport.GRPC,
  options: {
    url: '0.0.0.0:50051',
    package: 'serasa',
    protoPath: join(__dirname, './proto/cpf.proto'),
    loader: {
      keepCase: true,
    },
  },
};
