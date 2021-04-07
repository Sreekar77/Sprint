package com.bookmymovie.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmymovie.dao.CustomerDao;
import com.bookmymovie.dao.MovieDao;
import com.bookmymovie.dao.PaymentDao;
import com.bookmymovie.dao.TheatreDao;
import com.bookmymovie.model.Customer;
import com.bookmymovie.model.Movie;
import com.bookmymovie.model.Payment;
import com.bookmymovie.model.Theatre;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private TheatreDao theatre;
	
	@Autowired
	private MovieDao movie;
	
	@Autowired
	private CustomerDao cust;
	
	@Autowired
	private PaymentDao payment;
	
	@Override
	public Customer addCustomer(Customer customer) {
		return cust.save(customer);
	}

	@Override
	public List<Theatre> theatreNames(String name) {
		return theatre.theatreNames(name);
	}

	@Override
	public List<Movie> movieNames(String theatrename) {
		return movie.movieNames(theatrename);
	}

	@Override
	public List<Movie> getMovie() {
		return movie.findAll();
	}

	@Override
	public Payment getPayment(int bookingId) {
		return payment.findById(bookingId).orElse(null);
	}

}
