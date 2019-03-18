package com.MovieApp.demo.demoMovieApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MovieApp.demo.demoMovieApp.bean.Rating;
import com.MovieApp.demo.demoMovieApp.repo.RatingRepo;

@RestController
public class RatingController {

	@Autowired
	private RatingRepo ratingrepo;
	
	@RequestMapping(method= RequestMethod.POST,value="/addr")
	public void addRating(@RequestBody Rating rating) {
		ratingrepo.save(rating);
	}
	
	
}
