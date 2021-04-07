package com.bookmymovie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
	
	@Id
	@Column(length = 5)
	@GeneratedValue
	private int bookingId;
	@Column(length = 10)
	private int amount;
	@Column(length = 10)
	private String transactionDate;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Payment(int bookingId, int amount, String transactionDate) {
		super();
		this.bookingId = bookingId;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}
	public Payment() {
		
	}
}
