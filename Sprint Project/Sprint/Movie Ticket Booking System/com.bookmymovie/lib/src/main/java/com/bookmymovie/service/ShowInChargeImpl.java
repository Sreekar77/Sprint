package com.bookmymovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmymovie.dao.MovieDao;
import com.bookmymovie.dao.TheatreDao;
import com.bookmymovie.model.Movie;
import com.bookmymovie.model.Theatre;

@Service
public class ShowInChargeImpl implements ShowInChargeService {
	
	@Autowired
	private MovieDao mdao;
	
	@Autowired
	private TheatreDao tdao;

	@Override
	public Movie save(Movie movie) {
		return mdao.save(movie);
	}

	@Override
	public String updateMovie(Movie movie) {
		if(mdao.existsById(movie.getMovieId())){
			mdao.save(movie);
			return "Movies were successfully updated";
		}
		else {
			return "Movies were not updated";
		}
	}

	@Override
	public Theatre save(Theatre theatre) {
		return tdao.save(theatre);
	}

	@Override
	public String updateTheatre(Theatre theatre) {
		if(tdao.existsById(theatre.getTheatreid())){
			tdao.save(theatre);
			return "Theatres were successfully updated";
		}
		else {
			return "Theatres were not updated";
		}
	}

}
