package com.hcl.example4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name, country, skill;
		String playerDetails;
		String[] details = new String[3];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter player Details");
		playerDetails = s.nextLine();
		details = playerDetails.split(",");
		name = details[0];
		country = details[1];
		skill = details[2];
		// System.out.println(details.length);
		Player p = new Player(name, country, skill);
		p.display();
	}

}
