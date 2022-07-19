package com.lucasilva.grpc.domain;

import com.lucasilva.grpc.dto.EmprestimoDto;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Emprestimo {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @Column(precision = 6, scale = 2, nullable = false)
    private BigDecimal valor;

    private Short parcelas;

    @Column(length = 11, nullable = false)
    private String cpf;

    public Emprestimo() { }

    public Emprestimo(EmprestimoDto emprestimoDto) {
        this.valor = emprestimoDto.getValor();
        this.parcelas = emprestimoDto.getParcelas();
        this.cpf = emprestimoDto.getCpf();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Short getParcelas() {
        return parcelas;
    }

    public void setParcelas(Short parcelas) {
        this.parcelas = parcelas;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
