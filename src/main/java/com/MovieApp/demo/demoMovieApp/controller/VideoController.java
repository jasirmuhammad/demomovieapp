package com.MovieApp.demo.demoMovieApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MovieApp.demo.demoMovieApp.bean.Video;
import com.MovieApp.demo.demoMovieApp.service.VideoService;

@RestController
public class VideoController {

	@Autowired
	private VideoService videoservice;

	@RequestMapping(method = RequestMethod.POST, value = "/addv")
	public void addVideo(@RequestBody Video video) {

		videoservice.add(video);

	}

	@RequestMapping("/getv")
	public List<Video> getAll() {

		List<Video> vlist = new ArrayList<>();
		videoservice.findAll().forEach(vlist::add);
		return vlist;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/updatv/{v_id}")
	public void updateVideo(@RequestBody Video video, @PathVariable Integer v_id) {
		videoservice.update(video, v_id);

	}

	@RequestMapping("/{id}/addvideo/{vid}")
	public void addMovie(@PathVariable int id, @PathVariable("vid") int vid) {

	}

}
