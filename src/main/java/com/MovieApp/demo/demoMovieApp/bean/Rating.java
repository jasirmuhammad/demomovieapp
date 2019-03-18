package com.MovieApp.demo.demoMovieApp.bean;

import javax.persistence.*;

@Entity
@Table(name = "RATING")
public class Rating {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "SOURCE")
	private String source;
	
	@Column(name = "VALUE")
	private String value;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
