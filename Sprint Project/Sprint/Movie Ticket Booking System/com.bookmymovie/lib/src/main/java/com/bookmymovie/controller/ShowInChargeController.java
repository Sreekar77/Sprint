package com.bookmymovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmymovie.model.Movie;
import com.bookmymovie.model.Theatre;
import com.bookmymovie.service.ShowInChargeImpl;

@RestController
@RequestMapping("/showincharge")
public class ShowInChargeController {
	
	@Autowired
	private ShowInChargeImpl showservice;
	
	//add movie
	@PostMapping("/addmovie")
	public Movie addMovie(@Validated @RequestBody Movie movie)
	{
		return showservice.save(movie);
	}
	
	//update movie
	@PutMapping("/updatemovie") 
	public String updateMovie(@RequestBody Movie movie){
		return showservice.updateMovie(movie);
		
	}
	
	//add theatre
	@PostMapping("/addtheatre")
	public Theatre addTheatre(@Validated @RequestBody Theatre theatre)
	{
		return showservice.save(theatre);
	}
	
	//updatetheatre
	@PutMapping("/updatetheatre") 
	public String updateTheatre(@RequestBody Theatre theatre){
		return showservice.updateTheatre(theatre);
		
	}
}
