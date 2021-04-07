package com.bookmymovie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookmymovie.model.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie,Integer> {
	
	@Query("select movie from Movie movie")
	List<Movie> getMovieList();
	
	@Query("select m from Movie m where theatres=?1")
	public List<Movie> movieNames(String name);

}
