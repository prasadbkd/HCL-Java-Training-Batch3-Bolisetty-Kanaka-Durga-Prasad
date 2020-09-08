package com.hcl.example1;

public class Venue {
	String name, city;

	public Venue(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("Venue Details: \n Venue name: %s \n city: %s", name, city);
	}

}
