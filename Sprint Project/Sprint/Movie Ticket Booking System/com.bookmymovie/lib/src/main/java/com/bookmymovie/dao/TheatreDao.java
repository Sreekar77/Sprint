package com.bookmymovie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookmymovie.model.Theatre;

@Repository
public interface TheatreDao extends JpaRepository<Theatre,Integer> {
	
	@Query("select theatre from Theatre theatre")
	List<Theatre> getTheatreList();
	
	@Query("select t from Theatre t where theatrecity=?1")
	public List<Theatre> theatreNames(String name);

}
