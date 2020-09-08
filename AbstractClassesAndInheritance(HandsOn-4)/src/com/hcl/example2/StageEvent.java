package com.hcl.example2;

public class StageEvent extends Event {

	private int noOfShows, noOfSeatsPerShow;

	public StageEvent() {
	}

	public StageEvent(String name, String detail, String ownerName, int noOfShows, int noOfSeatsPerShow) {
		super(name, detail, ownerName);
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;

	}

	public int getnoOfShows() {
		return noOfShows;
	}

	public void setnoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public int getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}

	public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	public double projectedRevenue() {
		double revenue;
		revenue = this.noOfShows * this.noOfSeatsPerShow * 50;
		return revenue;
	}
}
