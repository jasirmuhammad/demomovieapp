package com.MovieApp.demo.demoMovieApp.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MovieApp.demo.demoMovieApp.bean.Country;
import com.MovieApp.demo.demoMovieApp.bean.Person;
import com.MovieApp.demo.demoMovieApp.bean.Rating;
import com.MovieApp.demo.demoMovieApp.bean.Video;
import com.MovieApp.demo.demoMovieApp.repo.VideoRepo;

@Service
public class VideoService {

	@Autowired
	private VideoRepo videorepo;

	@Autowired
	private PersonService personservice;
	@Autowired
	private CountryService countryservice;
	@Autowired
	private RatingService ratingservice;

	public void add(Video video) {

		Set<Person> actors = new HashSet<>();
		for (Person p : video.getActorsId()) {
			actors.add(personservice.getOne(p.getId()));
		}
		Set<Person> writers = new HashSet<>();
		for (Person p : video.getWriterId()) {
			writers.add(personservice.getOne(p.getId()));
		}

		Person pd = video.getDirectorId();
		video.setDirectorId(personservice.getOne(pd.getId()));
		Country c = video.getCountryId();
		video.setCountryId(countryservice.getOne(c.getId()));

		Rating r = video.getRatingsId();
		video.setRatingsId(ratingservice.getOne(r.getId()));

		video.setWriterId(writers);
		video.setActorsId(actors);

		videorepo.save(video);

	}

	public List<Video> findAll() {

		List<Video> vlist = new ArrayList<>();
		videorepo.findAll().forEach(vlist::add);
		return vlist;
	}

	public Video update(Video video, Integer v_id) {
		Video saveVideo = videorepo.getOne(v_id);
		BeanUtils.copyProperties(video, saveVideo);
		videorepo.save(saveVideo);
		return saveVideo;
	}

	public Set<Video> allVideo() {

		Set<Video> vSet = new HashSet<Video>();
		videorepo.findAll().forEach(vSet::add);
		return vSet;
	}

}
