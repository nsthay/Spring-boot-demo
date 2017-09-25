package com.nksthay.springboot.web.model;

//Represents a movie for JSON mapping and holds movie information
public class Movie {
	private String title;
	private String year;
	private String urlPoster;
	private String idIMDB;
	private String rating;
	public int ranking;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getUrlPoster() {
		return urlPoster;
	}
	public void setUrlPoster(String urlPoster) {
		this.urlPoster = urlPoster;
	}
	public String getIdIMDB() {
		return idIMDB;
	}
	public void setIdIMDB(String idIMDB) {
		this.idIMDB = idIMDB;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
}
