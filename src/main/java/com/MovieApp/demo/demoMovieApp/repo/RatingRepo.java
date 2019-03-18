package com.MovieApp.demo.demoMovieApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MovieApp.demo.demoMovieApp.bean.Rating;

public interface RatingRepo extends JpaRepository<Rating, Integer>  {

}
