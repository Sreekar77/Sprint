package com.bookmymovie.utils;

@SuppressWarnings("serial")
public class PaymentNotFoundException extends RuntimeException {
	public PaymentNotFoundException(int paymentid) {
		System.out.println("This Transaction Id doesn't exist");
	}
}