package com.hcl.example6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long over;
		long ball;
		long runs;
		String batsman;
		String bowler;
		String nonStriker;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the over");
		over = s.nextLong();
		System.out.println("Enter the ball");
		ball = s.nextLong();
		System.out.println("Enter the runs");
		runs = s.nextLong();
		System.out.println("Enter the batsman name");
		s.nextLine();
		batsman = s.nextLine();
		System.out.println("Enter the bowler name");
		bowler = s.nextLine();
		System.out.println("Enter the Non-Striker name");
		nonStriker = s.nextLine();
		DeliveryDetails d = new DeliveryDetails(over, ball, runs, batsman, bowler, nonStriker);
		System.out.println("Over: " + d.getOver());
		System.out.println("Ball: " + d.getBall());
		System.out.println("Run: " + d.getRuns());
		System.out.println("Batsman: " + d.getBatsman());
		System.out.println("Bowler: " + d.getBowler());
		System.out.println("Non-Striker: " + d.getNonStriker());

	}

}
