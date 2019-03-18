package com.MovieApp.demo.demoMovieApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MovieApp.demo.demoMovieApp.bean.Country;
import com.MovieApp.demo.demoMovieApp.repo.CountryRepo;

@Service
public class CountryService {

	@Autowired
	private CountryRepo countryrepo;
	
	public Country getOne(Integer id) {
		Country country = countryrepo.getOne(id);
		return country;
	}
	
}
