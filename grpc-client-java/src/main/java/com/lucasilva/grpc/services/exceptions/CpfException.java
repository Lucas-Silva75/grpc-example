package com.lucasilva.grpc.services.exceptions;

public class CpfException extends RuntimeException {

	public CpfException(String msg) {
		super(msg);
	}
}