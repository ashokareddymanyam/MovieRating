package com.movierating.api.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movierating.api.entity.MovieData;
import com.movierating.api.services.MovieRatingService;
import com.movierating.api.web.vm.CustomerVM;

@RestController
@RequestMapping("/api/rest")
public class MovieRatingController {
	
@Autowired
private MovieRatingService homeService;

@PostMapping("/customer/{id}/rate/{rating}")
public MovieData addRating(@PathVariable("id") Long id, @RequestParam("movie") String movie, @PathVariable("rating") Double rating) {
	
	System.out.println("Id" + id + "movie" + movie +"Rating"+ rating);
	MovieData addRatingToMovie = homeService.addRatingToMovie(id,movie,rating);
	System.out.println(addRatingToMovie);
	return addRatingToMovie;
}	

@GetMapping("/maxratedmovie")
public String getHighestRatedMovie() {
	Optional<String> findHighestRatedMovie = homeService.findHighestRatedMovie();
	
	if(findHighestRatedMovie.isPresent()) {
		return findHighestRatedMovie.get();
	}
	return "No data found!";
}

@GetMapping("/maxratedcustomer")
public CustomerVM getHighestRatedCustomer() {
	CustomerVM findHighestRatedCustomer = homeService.findHighestRatedCustomer();
	return findHighestRatedCustomer;
	
}
	
	
}
