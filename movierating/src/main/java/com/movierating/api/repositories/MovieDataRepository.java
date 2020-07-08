package com.movierating.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movierating.api.entity.MovieData;

@Repository
public interface MovieDataRepository extends JpaRepository<MovieData, String>{

}
