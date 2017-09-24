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

@Service
public class MovieListService {
	public Movie[] getMovieList() {
		Movie[] movieList = new Movie[10];
		String JsonString, line;
		StringBuilder sb = new StringBuilder();
		try {
			URL url = new URL("http://api.myapifilms.com/imdb/top?start=1&end=10&token=c466d04b-5690-49c9-b79b-7d27d566f5f3&format=json&data=0");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			while((line = in.readLine()) != null)
				sb.append(line);
		} catch (MalformedURLException e) {
			movieList[0].setTitle("Error: URL is not valid");
		} catch (IOException e) {
			System.out.println("Input messed up: ");
		}
		JsonString = sb.toString();
		ObjectMapper objMapper = new ObjectMapper();
		objMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		
		TopMovie movies;
		try {
			movies = objMapper.readValue(JsonString, TopMovie.class);
			movieList = movies.getData().getMovies();
		} catch (JsonParseException e) {
			System.out.println("Json parse messed up");
		} catch (JsonMappingException e) {
			System.out.println("Json mapping messed up");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Input messed up");
		}
		
		return movieList;
	}
}
