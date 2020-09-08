package com.hcl.example4;

public class Player {
	String name, country, skill;

	public Player(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	public void display() {
		System.out.println("Player Details : \n" + "Player Name :" + name + " \n" + "Country Name : " + country + "\n"
				+ "Skill :" + skill);
	}
}
