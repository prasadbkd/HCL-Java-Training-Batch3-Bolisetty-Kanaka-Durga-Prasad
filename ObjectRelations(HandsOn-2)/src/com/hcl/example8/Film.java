package com.hcl.example8;

public class Film {
	private String filmName;
	private Actor[] actors;

	public Film() {
	}

	public Film(String filmName, Actor[] actors) {
		super();
		this.filmName = filmName;
		this.actors = actors;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public Actor[] getActors() {
		return actors;
	}

	public void setActors(Actor[] actors) {
		this.actors = actors;
	}

}
