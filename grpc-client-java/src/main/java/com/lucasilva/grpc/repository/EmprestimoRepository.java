package com.lucasilva.grpc.repository;

import com.lucasilva.grpc.domain.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, String> { }
