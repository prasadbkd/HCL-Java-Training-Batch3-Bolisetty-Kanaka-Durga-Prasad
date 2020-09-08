package com.hcl.example2;

public class Player {
	String name, country, skill;

	public Player(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	@Override
	public String toString() {
		return String.format("Player Details : \n" + "Player Name : %s \n" + "Country Name : %s \n" + "Skill : %s",
				name, country, skill);
	}

}
