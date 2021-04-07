package com.bookmymovie.service;

import java.util.List;

import com.bookmymovie.model.Administrator;
import com.bookmymovie.model.Movie;
import com.bookmymovie.model.Theatre;

public interface AdministratorService {
	
	Movie save(Movie movie);
	List<Movie> getMovieList();
	String updateMovie(Movie movie);
	void removeMovie(int movieId);
	
	Theatre save(Theatre theatre);
	List<Theatre> getTheatreList();
	String updateTheatre(Theatre theatre);
	void removeTheatre(int theatreid);
	
	public Administrator addAdmin(Administrator admin); 

}
