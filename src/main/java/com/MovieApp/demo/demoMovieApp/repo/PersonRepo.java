package com.MovieApp.demo.demoMovieApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MovieApp.demo.demoMovieApp.bean.Person;


public interface PersonRepo extends JpaRepository<Person, Integer> {

	

}