package com.MovieApp.demo.demoMovieApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MovieApp.demo.demoMovieApp.bean.Rating;
import com.MovieApp.demo.demoMovieApp.repo.RatingRepo;

@Service
public class RatingService {

	@Autowired
	private RatingRepo ratingrepo;
	
	public Rating getOne(Integer id) {
		Rating rating = ratingrepo.getOne(id);
		return rating;
	}
	
}
