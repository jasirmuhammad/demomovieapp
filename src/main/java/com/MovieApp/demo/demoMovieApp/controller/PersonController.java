package com.MovieApp.demo.demoMovieApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MovieApp.demo.demoMovieApp.bean.Person;
import com.MovieApp.demo.demoMovieApp.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personservice;

	@RequestMapping(method = RequestMethod.POST, value = "/addp")
	public void addPerson(@RequestBody Person person) {

		personservice.add(person);

	}

	@RequestMapping("/getp")
	public List<Person> getAll() {

		List<Person> plist = new ArrayList<>();
		personservice.findAll().forEach(plist::add);
		return plist;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/updatp/{p_id}")
	public void updatePerson(@RequestBody Person person, @PathVariable Integer p_id) {
		personservice.update(person, p_id);

	}
	
}