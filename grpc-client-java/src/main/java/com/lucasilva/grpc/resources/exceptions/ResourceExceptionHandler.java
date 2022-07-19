package com.lucasilva.grpc.resources.exceptions;

import com.lucasilva.grpc.services.exceptions.CpfException;
import com.lucasilva.grpc.services.exceptions.IntegrationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(IntegrationException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public StandardError integrationException(HttpServletRequest request, IntegrationException ex) {
		var details = ex.getMessage();

		return new StandardError(
				HttpStatus.INTERNAL_SERVER_ERROR.value(),
				details,
				System.currentTimeMillis());
	}

	@ExceptionHandler(CpfException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public StandardError cpfException(HttpServletRequest request, CpfException ex) {
		var details = ex.getMessage();

		return new StandardError(
				HttpStatus.BAD_REQUEST.value(),
				details,
				System.currentTimeMillis());
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public StandardError validation(
			HttpServletRequest request,
			MethodArgumentNotValidException ex) {

		var err = new ErrosValidacao(
				HttpStatus.BAD_REQUEST.value(),
				"Erro de validação",
				System.currentTimeMillis());

		var errors = ex.getBindingResult().getFieldErrors();
		errors.forEach(e -> err.addErro(e.getField(), e.getDefaultMessage()));

		return err;
	}
}