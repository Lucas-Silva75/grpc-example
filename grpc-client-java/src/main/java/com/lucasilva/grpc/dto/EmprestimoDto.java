package com.lucasilva.grpc.dto;

import javax.validation.constraints.*;
import java.math.BigDecimal;

public class EmprestimoDto {

    @NotNull(message = "Preenchimento obrigatório")
    @Max(value = 50000, message = "Limite máximo para empréstimo é R$ 50.000")
    @Min(value = 100, message = "Limite mínimo para empréstimo é R$ 100")
    private BigDecimal valor;

    @NotNull(message = "Preenchimento obrigatório")
    @Max(value = 150, message = "Máximo de parcelas é 150")
    @Min(value = 2, message = "Mínimo de parcelas é 2")
    private Short parcelas;

    @NotEmpty(message = "Preenchimento obrigatório")
    @Size(min = 11, max = 11, message = "CPF deve conter 11 dígitos")
    private String cpf;

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
