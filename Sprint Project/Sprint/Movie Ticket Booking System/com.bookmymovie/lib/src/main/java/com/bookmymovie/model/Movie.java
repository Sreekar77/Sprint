package com.bookmymovie.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "movie")
public class Movie {

	@Id
	@GeneratedValue
	private int movieId;
	@Column
	@JsonProperty
	private String movieName;
	@Column
	@JsonProperty
	private Date movieDate;
	@Column
	private String genre;
	@Column
	private String rating;
	@Column
	private String duration;
	@Column
	private String theatres;

	public Movie(int movieId, String movieName, Date movieDate, String genre, String rating, String duration,String theatres) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDate = movieDate;
		this.genre = genre;
		this.rating = rating;
		this.duration = duration;
		this.theatres = theatres;
	}

	public Movie() {

	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Date getMovieDate() {
		return movieDate;
	}

	public void setMovieDate(Date movieDate) {
		this.movieDate = movieDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTheatres() {
		return theatres;
	}

	public void setTheatres(String theatres) {
		this.theatres = theatres;
	}
}