package com.hcl.example3;

import java.util.Scanner;

public class DeliveryMain {

	public static void main(String[] args) {
		long over, ball, runs;
		String batsman, bowler, nonStriker;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Over :");
		over = s.nextLong();
		System.out.println("Enter the ball :");
		ball = s.nextLong();
		System.out.println("Enter the runs :");
		runs = s.nextLong();
		s.nextLine();
		System.out.println("Enter the Batsman name :");
		batsman = s.nextLine();
		System.out.println("Enter the Bowler name :");
		bowler = s.nextLine();
		System.out.println("Enter the Non-Striker name :");
		nonStriker = s.nextLine();
		Delivery d = new Delivery(over, ball, runs, batsman, bowler, nonStriker);
		d.displayDeliveryDetails();
	}

}
