package com.MovieApp.demo.demoMovieApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MovieApp.demo.demoMovieApp.bean.Video;

public interface VideoRepo extends JpaRepository<Video, Integer> {

}
