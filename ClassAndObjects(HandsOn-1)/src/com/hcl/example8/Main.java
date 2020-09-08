package com.hcl.example8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long over;
		long ball;
		String wicketType;
		String playerName;
		String bowlerName;
		int n;
		String[] details;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of wickets");
		n = s.nextInt();
		String[] c = new String[n];
		s.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the wicket Details " + (i + 1));
			c[i] = s.nextLine();
		}
		System.out.println("Wicket details: ");
		for (int i = 0; i < n; i++) {
			details = c[i].split(",");
			over = Long.parseLong(details[0]);
			ball = Long.parseLong(details[1]);
			wicketType = details[2];
			playerName = details[3];
			bowlerName = details[4];
			Wicket w = new Wicket(over, ball, wicketType, playerName, bowlerName);
			System.out.println("Over: " + w.getOver());
			System.out.println("Ball: " + w.getBall());
			System.out.println("Wicket Type: " + w.getWicketType());
			System.out.println("Player Name: " + w.getPlayerName());
			System.out.println("Bowler Name: " + w.getBowlerName());

		}
	}
}