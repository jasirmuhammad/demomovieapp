package com.MovieApp.demo.demoMovieApp.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MovieApp.demo.demoMovieApp.bean.Person;
import com.MovieApp.demo.demoMovieApp.repo.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personrepo;

	public void add(Person person) {
		personrepo.save(person);
	}

	public Person getOne(Integer p_id) {
		Person person = personrepo.getOne(p_id);
		return person;
	}

	public List<Person> findAll() {

		List<Person> plist = new ArrayList<>();
		personrepo.findAll().forEach(plist::add);
		return plist;
	}

	public Person update(Person person, Integer p_id) {
		Person savePerson = personrepo.getOne(p_id);
		BeanUtils.copyProperties(person, savePerson);
		personrepo.save(savePerson);
		return savePerson;
	}

	public Set<Person> allPerson() {
		Set<Person> pSet = new HashSet<Person>();
		personrepo.findAll().forEach(pSet::add);
		return pSet;
	}
}
