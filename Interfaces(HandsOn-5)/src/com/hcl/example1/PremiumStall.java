package com.hcl.example1;

public class PremiumStall implements Stall {

	private String stall_name, owner_name;
	private int cost, noOfProjectors;

	public PremiumStall() {
	}

	public PremiumStall(String stall_name, String owner_name, int cost, int noOfProjectors) {
		super();
		this.stall_name = stall_name;
		this.owner_name = owner_name;
		this.cost = cost;
		this.noOfProjectors = noOfProjectors;
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

	public int getNoOfProjectors() {
		return noOfProjectors;
	}

	public void setNoOfProjectors(int noOfProjectors) {
		this.noOfProjectors = noOfProjectors;
	}

	@Override
	public String toString() {
		return String.format("GoldStall Details: \nStall Name: %s \nOwner Name=%s \nCost: %s \nNo of Projectors: %s",
				stall_name, owner_name, cost, noOfProjectors);
	}

	@Override
	public void display() {
		System.out.println(this);
	}

}
