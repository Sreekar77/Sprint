package com.bookmymovie.utils;

public class CustomerException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	final String message;

	public CustomerException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
