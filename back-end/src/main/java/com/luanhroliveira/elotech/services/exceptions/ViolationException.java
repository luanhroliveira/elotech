package com.luanhroliveira.elotech.services.exceptions;

public class ViolationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ViolationException(String msg) {
		super(msg);
	}
}
