package com.lucasilva.grpc.resources;

import com.lucasilva.grpc.domain.Emprestimo;
import com.lucasilva.grpc.dto.EmprestimoDto;
import com.lucasilva.grpc.services.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/emprestimos")
public class EmprestimoResource {

    @Autowired
    private EmprestimoService service;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Emprestimo concederEmprestimo(@RequestBody @Valid EmprestimoDto emprestimoDto) {
        return service.concederEmprestimo(emprestimoDto);
    }
}
