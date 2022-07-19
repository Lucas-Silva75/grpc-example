package com.lucasilva.grpc.services;

import com.lucasilva.grpc.domain.Emprestimo;
import com.lucasilva.grpc.dto.EmprestimoDto;
import com.lucasilva.grpc.integration.RequestIntegration;
import com.lucasilva.grpc.repository.EmprestimoRepository;
import com.lucasilva.grpc.services.exceptions.CpfException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService {

    @Autowired
    private RequestIntegration integration;

    @Autowired
    private EmprestimoRepository repository;

    public Emprestimo concederEmprestimo(EmprestimoDto emprestimoDto) {

        var situacao = integration.consultarRestricoesCpf(emprestimoDto.getCpf());

        if(situacao.equals("NEGATIVADO")) {
            throw new CpfException("Não foi possível conceder o empréstimo, pois o cpf está negativado no serasa");
        }

        var emprestimo = new Emprestimo(emprestimoDto);

        return repository.save(emprestimo);
    }
}
