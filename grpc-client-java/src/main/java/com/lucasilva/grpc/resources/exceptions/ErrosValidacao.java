package com.lucasilva.grpc.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ErrosValidacao extends StandardError {
	private static final long serialVersionUID = 1L;

	private final List<FieldMessage> erros = new ArrayList<>();
	
	public ErrosValidacao(Integer status, String detalhes, Long timeStamp) {
		super(status, detalhes, timeStamp);
	}

	public List<FieldMessage> getErrors() {
		return erros;
	}

	public void addErro(String campo, String messagem) {
		erros.add(new FieldMessage(campo, messagem));
	}
}