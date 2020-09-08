package com.hcl.example3;

public class Delivery {
	long over, ball, runs;
	String batsman, bowler, nonStriker;

	public Delivery(long over, long ball, long runs, String batsman, String bowler, String nonStriker) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}

	void displayDeliveryDetails() {
		System.out.println("Delivey Details: \nOver: " + over + "\n Ball :" + ball + "\n Runs: " + runs + "\n Batsman: "
				+ batsman + "\n Bowler: " + bowler + " \n Non-Striker: " + nonStriker);
	}
}
