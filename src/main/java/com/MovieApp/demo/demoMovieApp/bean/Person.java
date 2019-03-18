package com.MovieApp.demo.demoMovieApp.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PERSON")
public class Person {

	

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "P_ID")
	private int id;
	
	@Column(name = "NAME")
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "directorId")
	private Set<Video> videoId = new HashSet<Video>();
	
	public Person() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@JsonIgnore
	public Set<Video> getVideoId() {
		return videoId;
	}

	public void setVideoId(Set<Video> videoId) {
		this.videoId = videoId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
