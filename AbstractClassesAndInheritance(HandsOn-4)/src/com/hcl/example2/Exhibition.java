package com.hcl.example2;

public class Exhibition extends Event {

	int noOfStalls;

	public Exhibition() {
	}

	public Exhibition(String name, String detail, String ownerName, int noOfStalls) {
		super(name, detail, ownerName);
		this.noOfStalls = noOfStalls;
	}

	public int getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(int noOfStalls) {
		this.noOfStalls = noOfStalls;
	}

	public double projectedRevenue() {

		double revenue;
		revenue = this.noOfStalls * 10000;
		return revenue;
	}
}
