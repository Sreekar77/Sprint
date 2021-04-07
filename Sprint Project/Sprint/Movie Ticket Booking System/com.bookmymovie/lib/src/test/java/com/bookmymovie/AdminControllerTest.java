package com.bookmymovie;


import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.bookmymovie.dao.MovieDao;
import com.bookmymovie.dao.TheatreDao;
import com.bookmymovie.model.Movie;
import com.bookmymovie.model.Theatre;
import com.bookmymovie.service.AdministratorServiceImpl;

@MockitoSettings(strictness = Strictness.LENIENT)
@RunWith(MockitoJUnitRunner.class)
public class AdminControllerTest {
	
	
	@InjectMocks
	AdministratorServiceImpl service1;
	
	@Mock
	TheatreDao dao1;
	
	@Mock
	MovieDao dao;
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	public void init() {
		System.out.println("** before method ***");
		MockitoAnnotations.initMocks(this); 
	}
	
	
	/*@Test
	public void testGetAllTheatres(){
	List<Theatre> theatreList = new ArrayList<Theatre>();
	theatreList.add(new Theatre(12,"acropolis","kolkata"));
	
	Mockito.when(dao1.findAll()).thenReturn(theatreList);
	assertEquals(1, theatreList.size());
	}
	*/
	
	@Test
	public void deleteTheatre(){
		new Theatre(11,"grand galada","chennai");
		dao1.deleteById(11);
	    Mockito.verify(dao1,Mockito.times(1)).deleteById(11);
	}
	
	@Test
	public void testaddTheatre() {
		Theatre theatre=new Theatre(18,"pvr","hyderabad");
		theatre.setTheatreid(18);
		theatre.setTheatrename("qwe");
		theatre.setTheatrename("malkajgiri");
		dao1.save(theatre);
	}
	@Test
	public void updateTheatre() {
		Theatre theatre = new Theatre(35,"mvrmall","bangalore");
		dao1.findById(35);
		dao1.save(theatre);
	   Mockito.verify(dao1, Mockito.times(1)).save(theatre);
	}

	/*
	@Test
	public void testGetAllMovies(){
	List<Movie> movieList = new ArrayList<Movie>();
	movieList.add(new Movie());
	
	Mockito.when(dao.findAll()).thenReturn(movieList);
	assertEquals(1, movieList.size());
	}
	*/
	
	@Test
	public void testaddMovie() {
		Movie movie=new Movie();
		movie.setMovieId(11);
		movie.setMovieName("conjuring");
		dao.save(movie);
	}

	@Test
	public void updateMovies() {
		Movie movie = new Movie();
		dao.findById(65);
		dao.save(movie);
	   Mockito.verify(dao, Mockito.times(1)).save(movie);
	}
	
	@Test
	public void deleteMovies(){
	dao.deleteById(3);
	Mockito.verify(dao, Mockito.times(1)).deleteById(3);
	}	
}