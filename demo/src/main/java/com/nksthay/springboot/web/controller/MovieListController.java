package com.nksthay.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.nksthay.springboot.web.model.Movie;
import com.nksthay.springboot.web.service.MovieListService;

@Controller
@SessionAttributes("name")
public class MovieListController {
	@Autowired
	MovieListService service;
	
	@RequestMapping(value="/movielist", method = RequestMethod.GET)
    public String showMovieListPage(ModelMap model){
		Movie[] movieList = service.getMovieList();
		for(int i = 0; i < movieList.length; i++) {
			//model.put("posterURL" + (i+1), movieList[i].getUrlPoster());
			model.put("title" + (i+1), movieList[i].getTitle());
			model.put("year" + (i+1), movieList[i].getYear());
			model.put("rating" + (i+1), movieList[i].getRating());
		}
		model.put("length", movieList.length);
    	return "movielist";
    }

}
