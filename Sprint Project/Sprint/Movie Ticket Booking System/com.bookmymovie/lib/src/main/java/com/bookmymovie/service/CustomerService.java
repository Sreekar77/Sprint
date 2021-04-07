package com.bookmymovie.service;

import java.util.List;

import com.bookmymovie.model.Customer;
import com.bookmymovie.model.Movie;
import com.bookmymovie.model.Payment;
import com.bookmymovie.model.Theatre;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	List<Theatre> theatreNames(String name);
	List<Movie> movieNames(String theatrename);
	public List<Movie> getMovie();
	public Payment getPayment(int bookingId);


}
