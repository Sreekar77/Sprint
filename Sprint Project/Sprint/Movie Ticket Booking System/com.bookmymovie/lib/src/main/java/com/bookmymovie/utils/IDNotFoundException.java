package com.bookmymovie.utils;

@SuppressWarnings("serial")
public class IDNotFoundException extends RuntimeException
{
	public IDNotFoundException()
	{
		super();
	}

	public IDNotFoundException(String message) 
	{
		super(message);
	}
}
