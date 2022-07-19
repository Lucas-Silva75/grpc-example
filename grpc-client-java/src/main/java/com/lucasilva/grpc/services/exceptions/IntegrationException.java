package com.lucasilva.grpc.services.exceptions;

public class IntegrationException extends RuntimeException {

	public IntegrationException(String msg) {
		super(msg);
	}
}