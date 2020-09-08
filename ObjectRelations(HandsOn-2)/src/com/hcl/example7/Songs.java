package com.hcl.example7;

public class Songs {
	private int id;
	private String name;
	private String singer;
	private int film_id;

	public Songs() {
	}

	public Songs(int id, String name, String singer,int film_id) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.film_id = film_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

}
