package com.movierating.api.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.movierating.api.rest","com.movierating.api.services","com.movierating.api.config",
	"com.movierating.api.entity","com.movierating.api.repositories"})
@EntityScan(basePackages = {"com.movierating.api.entity"})
public class MovieRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingApplication.class, args);
	}

}
