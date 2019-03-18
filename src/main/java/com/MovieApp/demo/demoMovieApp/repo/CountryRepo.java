package com.MovieApp.demo.demoMovieApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MovieApp.demo.demoMovieApp.bean.Country;

public interface CountryRepo extends JpaRepository<Country,Integer>{
	
}
