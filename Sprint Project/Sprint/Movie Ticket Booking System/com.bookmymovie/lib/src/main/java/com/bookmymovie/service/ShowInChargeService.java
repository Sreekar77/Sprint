package com.bookmymovie.service;

import com.bookmymovie.model.Movie;
import com.bookmymovie.model.Theatre;

public interface ShowInChargeService {
	
	Movie save(Movie movie);
	String updateMovie(Movie movie);
	
	Theatre save(Theatre theatre);
	String updateTheatre(Theatre theatre);

}
