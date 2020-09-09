package com.hcl.example1;

public class ExecutiveStall implements Stall {

	private String stall_name, owner_name;
	private int cost, noOfScreens;

	public ExecutiveStall() {
	}

	public ExecutiveStall(String stall_name, String owner_name, int cost, int noOfScreens) {
		super();
		this.stall_name = stall_name;
		this.owner_name = owner_name;
		this.cost = cost;
		this.noOfScreens = noOfScreens;
	}

	public String getStall_name() {
		return stall_name;
	}

	public void setStall_name(String stall_name) {
		this.stall_name = stall_name;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getNoOfScreens() {
		return noOfScreens;
	}

	public void setNoOfScreens(int noOfScreens) {
		this.noOfScreens = noOfScreens;
	}

	@Override
	public void display() {

		System.out.println(this);
	}

	@Override
	public String toString() {
		return String.format("GoldStall Details: \nStall Name: %s \nOwner Name: %s \nCost: %s \nNo of Screens: %s",
				stall_name, owner_name, cost, noOfScreens);
	}
}
