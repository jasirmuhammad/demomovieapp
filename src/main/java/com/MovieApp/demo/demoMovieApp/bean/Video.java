package com.MovieApp.demo.demoMovieApp.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "VIDEO")
public class Video {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "V_ID")
	private int id;
	@NotNull
    @Size(max = 65)
	@Column(name = "TITLE")
	private String title;

	@Column(name = "YEAR")
	private String year;

	@Column(name = "RATED")
	private String rated;

	@Column(name = "RELEASED")
	private String released;

	@Column(name = "RUNTIME")
	private String runtime;

	@Column(name = "GENRE")
	private String genre;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DIRECTOR_ID", referencedColumnName = "P_ID")
	
	private Person directorId;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "WRITER_PERSON", joinColumns = { 
			@JoinColumn(name = "V_ID" ) }, 
			inverseJoinColumns = { @JoinColumn(name = "P_ID" )
					})
	
	private Set<Person> writerId;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ACTOR_PERSON", joinColumns = { 
			@JoinColumn(name = "V_ID" ) }, 
			inverseJoinColumns = { @JoinColumn(name = "P_ID" )
					})
	
	private Set<Person> actorsId;

	@Column(name = "PLOT")
	private String plot;

	@Column(name = "LANGUAGE")
	private String Language;

	@OneToOne
	@JoinColumn(name = "COUNTRY_ID", referencedColumnName = "ID")
	private Country countryId;

	@Column(name = "AWARDS")
	private String awards;

	@Column(name = "POSTER")
	private String poster;

	@OneToOne
	@JoinColumn(name = "RATINGS_ID", referencedColumnName = "ID")
	private Rating ratingsId;

	@Column(name = "TYPE")
	private String type;

    public Person getDirectorId() {
		return directorId;
	}

	public void setDirectorId(Person directorId) {
		this.directorId = directorId;
	}

	public Set<Person> getWriterId() {
		return writerId;
	}

	public void setWriterId(Set<Person> writerId) {
		this.writerId = writerId;
	}

	public Set<Person> getActorsId() {
		return actorsId;
	}

	public void setActorsId(Set<Person> actorsId) {
		this.actorsId = actorsId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getRated() {
		return rated;
	}

	public void setRated(String rated) {
		this.rated = rated;
	}

	public String getReleased() {
		return released;
	}

	public void setReleased(String releaseDate) {
		this.released = releaseDate;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public Country getCountryId() {
		return countryId;
	}

	public void setCountryId(Country countryId) {
		this.countryId = countryId;
	}

	public String getAwards() {
		return awards;
	}

	public void setAwards(String awards) {
		this.awards = awards;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public Rating getRatingsId() {
		return ratingsId;
	}

	public void setRatingsId(Rating ratingsId) {
		this.ratingsId = ratingsId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
