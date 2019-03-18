package com.MovieApp.demo.demoMovieApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MovieApp.demo.demoMovieApp.bean.Country;
import com.MovieApp.demo.demoMovieApp.repo.CountryRepo;

@RestController
public class CountryController {

	@Autowired
	private CountryRepo countryrepo;
	
	
	
	@RequestMapping(method = RequestMethod.POST,value="/")
	public void addCountry() {
		Country country = new Country();
		country.setCode("ESP");
		country.setName("Spain");
		country.setLanguage("Spanish");
		
		Country country1 = new Country();
		country1.setCode("IND");
		country1.setName("India");
		country1.setLanguage("Hindi");
		Country country2 = new Country();
		country2.setCode("UAE");
		country2.setName("Dufai");
		country2.setLanguage("arabic");
		Country country3 = new Country();
		country3.setCode("PAK");
		country3.setName("Pakisthan");
		country3.setLanguage("Hindi");
		

		countryrepo.save(country);

		countryrepo.save(country1);

		countryrepo.save(country2);
		
		
		
		countryrepo.save(country3);
		
		
	}
}


