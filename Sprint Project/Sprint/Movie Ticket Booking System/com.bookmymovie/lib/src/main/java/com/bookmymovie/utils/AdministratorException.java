package com.bookmymovie.utils;


public class AdministratorException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final String message;
	
	public AdministratorException(String message){
		super();
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}