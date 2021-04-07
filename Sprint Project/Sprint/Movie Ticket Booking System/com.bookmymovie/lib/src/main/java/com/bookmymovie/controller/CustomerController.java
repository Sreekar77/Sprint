package com.bookmymovie.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookmymovie.model.Customer;
import com.bookmymovie.model.Movie;
import com.bookmymovie.model.Payment;
import com.bookmymovie.model.Theatre;
import com.bookmymovie.service.CustomerServiceImpl;
import com.bookmymovie.utils.CustomerException;
import com.bookmymovie.utils.PaymentNotFoundException;

@RestController
@RequestMapping("/user")
public class CustomerController {
	private CustomerServiceImpl userservice;

	@Autowired
	public CustomerController(CustomerServiceImpl userservice) {
		this.userservice = userservice;
	}
	
	//adding customer to database
	@PostMapping("/addcustomer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {

		Customer customerData = userservice.addCustomer(customer);

		if (!customer.getEmail().matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"))
			throw new CustomerException("Invalid Email ID");

		if (!customer.getPassword().matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"))
			throw new CustomerException("Invalid Password");

		if (!customer.getPhoneno().matches("^[0-9]+$"))
			throw new CustomerException("Invalid Phone Number");

		return new ResponseEntity<Customer>(customerData, HttpStatus.OK);
	}

	// displaying theaters by city name
	@GetMapping("/theatres/{city-name}")
	public List<Theatre> theatreNames(@PathVariable("city-name") String name) {
		return userservice.theatreNames(name);
	}

	// displaying movies by theatre name
	@GetMapping("/movies/{theatre-name}")
	public List<Movie> movieNames(@PathVariable("theatre-name") String theatrename) {
		return userservice.movieNames(theatrename);
	}
	
	//displaying all movies
	@GetMapping("/movies")
	public ResponseEntity<List<Movie>> getAllMovies(@RequestParam Map<String, String> dates) {
		List<Movie> movies = userservice.getMovie();
		return ResponseEntity.status(HttpStatus.OK).body(movies);
	}
	
	//displaying payment to be done by bookingid
	@GetMapping("/payment/{bookingId}")
	public ResponseEntity<Payment> getPayment(@PathVariable int bookingId) throws PaymentNotFoundException {
		Payment payment = userservice.getPayment(bookingId);
		if (payment == null) {
			throw new PaymentNotFoundException(bookingId);
		}
		return ResponseEntity.status(HttpStatus.OK).body(payment);
	}


}
