package com.nksthay.springboot.web.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.nksthay.springboot.web.model.*;

//Helper class for movie list controller
@Service
public class MovieListService {
	//Gets movie list from JSON data
	public Movie[] getMovieList() {
		Movie[] movieList = new Movie[10];
		String line;
		StringBuilder sb = new StringBuilder();
		TopMovie movies;
		
		//Reads in JSON string from api through the string builder
		try {
			URL url = new URL("http://api.myapifilms.com/imdb/top?start=1&end=10&token=c466d04b-5690-49c9-b79b-7d27d566f5f3&format=json&data=0");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			while((line = in.readLine()) != null)
				sb.append(line);
		} catch (MalformedURLException e) {
			System.out.println("URL is not valid");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Input error");
			e.printStackTrace();
		}
		
		//Initialize object mapper
		ObjectMapper objMapper = new ObjectMapper();
		objMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES); //ignore unused properties
		
		//Maps JSON string to objects and gets list of movie objects to return
		try {
			movies = objMapper.readValue(sb.toString(), TopMovie.class);
			movieList = movies.getData().getMovies();
		} catch (JsonParseException e) {
			System.out.println("Json parse error");
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.out.println("Json mapping error");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Input error");
			e.printStackTrace();
		}
		
		return movieList;
	}
}
