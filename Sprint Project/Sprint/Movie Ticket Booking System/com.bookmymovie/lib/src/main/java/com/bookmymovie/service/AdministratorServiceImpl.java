package com.bookmymovie.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmymovie.dao.AdministratorDao;
import com.bookmymovie.dao.MovieDao;
import com.bookmymovie.dao.TheatreDao;
import com.bookmymovie.model.Administrator;
import com.bookmymovie.model.Movie;
import com.bookmymovie.model.Theatre;
import com.bookmymovie.utils.IDNotFoundException;

@Service
@Transactional
public class AdministratorServiceImpl implements AdministratorService {
	
	@Autowired
	private AdministratorDao adao;
	
	@Autowired
	private MovieDao mdao;
	
	@Autowired
	private TheatreDao tdao;

	@Override
	public Administrator addAdmin(Administrator admin) {
		return adao.save(admin);
	}

	@Override
	public Movie save(Movie movie) {
		return mdao.save(movie);
	}

	@Override
	public List<Movie> getMovieList() {
		return mdao.getMovieList();
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
	public void removeMovie(int movieId) {
		if(!mdao.existsById(movieId)){
			throw new IDNotFoundException();
		}
		mdao.deleteById(movieId);
	}

	@Override
	public Theatre save(Theatre theatre) {
		return tdao.save(theatre);
	}

	@Override
	public List<Theatre> getTheatreList() {
		return tdao.getTheatreList();
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

	@Override
	public void removeTheatre(int theatreid) {
		if(!tdao.existsById(theatreid)){
			throw new IDNotFoundException();
		}
		tdao.deleteById(theatreid);
		
	}



}
