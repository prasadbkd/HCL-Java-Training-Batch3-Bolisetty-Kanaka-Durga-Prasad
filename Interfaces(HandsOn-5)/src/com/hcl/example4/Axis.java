package com.hcl.example4;

public class Axis implements MutualFund {
	private int duration;
	private double amount;

	public Axis() {
	}

	public Axis(int duration, double amount) {
		super();
		this.duration = duration;
		this.amount = amount;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public void duration() {
		System.out.println(this.duration);
	}

	@Override
	public void amount() {
		double returns;
		returns = this.amount * this.duration * 0.56;
		System.out.println("The returns amount is " + returns);
	}

}


