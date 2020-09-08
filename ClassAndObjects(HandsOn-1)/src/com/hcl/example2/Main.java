package com.hcl.example2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name, country, skill;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the player name :");
		name = s.nextLine();
		System.out.println("Enter the country :");
		country = s.nextLine();
		System.out.println("Enter the skill :");
		skill = s.nextLine();
		Player p = new Player(name, country, skill);
		System.out.println(p);
	}

}
