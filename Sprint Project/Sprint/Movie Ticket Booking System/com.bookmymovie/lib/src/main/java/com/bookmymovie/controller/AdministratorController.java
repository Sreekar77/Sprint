package com.bookmymovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmymovie.model.Administrator;
import com.bookmymovie.model.Movie;
import com.bookmymovie.model.Theatre;
import com.bookmymovie.service.AdministratorServiceImpl;
import com.bookmymovie.utils.AdministratorException;

@RestController
@RequestMapping("/admin")
public class AdministratorController {
	
	private AdministratorServiceImpl adminservice;
	
	@Autowired
	public AdministratorController(AdministratorServiceImpl adminservice) {
		this.adminservice=adminservice;
	}
	
	//adding admin to database
	@PostMapping("/addadmin")
	public ResponseEntity<Administrator> addAdmin(@RequestBody Administrator admin) {
		
		Administrator AdminData = adminservice.addAdmin(admin);
		
		if(admin.getAdminId()>100 || admin.getAdminId() < 1)
			throw new AdministratorException("Invalid ID Number");
		
		if (!admin.getEmail().matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"))
			throw new AdministratorException("Invalid Email ID");

		if (!admin.getPassword().matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"))
			throw new AdministratorException("Invalid Password");
		
		return new ResponseEntity<Administrator>(AdminData, HttpStatus.OK);
	}
	
	//adding movie by admin 
	@PostMapping("/addmovie")
	public Movie addMovie(@Validated @RequestBody Movie movie)
	{
		return adminservice.save(movie);
	}
	
	//displaying movie list
	@GetMapping("/movieslist")
	public List<Movie> movieList() {
		return adminservice.getMovieList();
	}
	
	//updating movie
	@PutMapping("/updatemovie/{moviename}") 
	public String updateMovie(@RequestBody Movie movie){
		return adminservice.updateMovie(movie);
		
	}
	
	//deleting movie by movieid
	@DeleteMapping("/removeMovie/{movieid}")
    public String removeMovie(@PathVariable int movieid)
    {
   	 adminservice.removeMovie(movieid);
   	 return "Movie Details Removed";
    }
	
	//adding theatre by admin
	@PostMapping("/addtheatre")
	public Theatre addTheatre(@Validated @RequestBody Theatre theatre)
	{
		return adminservice.save(theatre);
	}
	
	//displaying theatre list
	@GetMapping("/theatreslist")
	public List<Theatre> TheatreList() {
		return adminservice.getTheatreList();
	}
	
	//updating theatre
	@PutMapping("/updatetheatre") 
	public String updateTheatre(@RequestBody Theatre theatre){
		return adminservice.updateTheatre(theatre);
		
	}
	
	//deleting theatre by theatreid
	@DeleteMapping("/removetheatre/{theatreid}")
    public String removeTheatre(@PathVariable int theatreid)
    {
   	 adminservice.removeTheatre(theatreid);
   	 return "Theatre Details Removed";
    }
}
