import { Module } from '@nestjs/common';
import { CpfModule } from './serasa/cpf.module';

@Module({
  imports: [CpfModule],
  controllers: [],
  providers: [],
})
export class AppModule {}
