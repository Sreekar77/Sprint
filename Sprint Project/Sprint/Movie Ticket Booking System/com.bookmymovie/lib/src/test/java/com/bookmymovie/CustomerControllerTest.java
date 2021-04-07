package com.bookmymovie;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;

import java.util.ArrayList; 
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.bookmymovie.dao.CustomerDao;
import com.bookmymovie.dao.MovieDao;
import com.bookmymovie.dao.PaymentDao;
import com.bookmymovie.dao.TheatreDao;
import com.bookmymovie.model.Customer;
import com.bookmymovie.model.Movie;
import com.bookmymovie.model.Payment;
import com.bookmymovie.model.Theatre;



@RunWith(MockitoJUnitRunner.class)
public class CustomerControllerTest {
	


		@Mock
	    private TheatreDao theatreDao;
		
		@Mock
	    private MovieDao moviesDao;
		
		@Mock
	    private PaymentDao paymentDao;

		@Mock
	    private CustomerDao customerDao;
		
		@SuppressWarnings("deprecation")
		@Before
		public void setup(){
			MockitoAnnotations.initMocks(this);
		}
		
		@Test
		public void testTheatreNames(){
			List<Theatre> TheatreNames = new ArrayList<Theatre>();
			TheatreNames.add(new Theatre(11,"pvr","pune"));
			TheatreNames.add(new Theatre(24,"inox","kolkata"));
			when(theatreDao.theatreNames(anyString())).thenReturn(TheatreNames);
			List<Theatre> result = theatreDao.theatreNames("pune");
			assertEquals(2, result.size());
		}
		
		@Test
		public void testGetMovieNames(){
			List<Movie> Movie = new ArrayList<Movie>();
			Movie.add(new Movie());
			Movie.add(new Movie());
			when(moviesDao.movieNames(anyString())).thenReturn(Movie);
			List<Movie> result = moviesDao.movieNames("pune");
			assertEquals(2, result.size());
		}
		
		@Test
		public void testaddPayments() {
			Payment payments=new Payment();
			paymentDao.save(payments);
			verify(paymentDao, Mockito.times(1)).save(payments);
		}
		
		@Test
		public void testaddCustomer() {
			Customer customer=new Customer("abc","abc@abc.in","abc123","123");
			customerDao.save(customer);
			verify(customerDao, Mockito.times(1)).save(customer);
		}
	}
