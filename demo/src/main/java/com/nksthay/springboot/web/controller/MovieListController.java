package com.nksthay.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nksthay.springboot.web.model.Movie;
import com.nksthay.springboot.web.service.MovieListService;

@Controller
public class MovieListController {
	//Initialize a service helper for the movie list
	@Autowired
	MovieListService service;
	
	//Displays top movies on page
	@RequestMapping(value="/movielist", method = RequestMethod.GET)
    public String showMovieListPage(ModelMap model){
		//Get list of movies from helper
		Movie[] movieList = service.getMovieList();
		//Place each piece of movie info in page document
		for(int i = 0; i < movieList.length; i++) {
			model.put("ranking" + (i+1), movieList[i].getRanking());
			model.put("posterURL" + (i+1), movieList[i].getUrlPoster());
			model.put("title" + (i+1), movieList[i].getTitle());
			model.put("year" + (i+1), movieList[i].getYear());
			model.put("rating" + (i+1), movieList[i].getRating());
		}
		//Put number of movies in page document
		model.put("length", movieList.length);
		//Shows movie list page
    	return "movielist";
    }

}
