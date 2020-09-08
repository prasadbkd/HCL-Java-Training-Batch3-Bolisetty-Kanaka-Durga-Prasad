package com.hcl.example3;

public class Stall {

	protected String StallName;
	protected String detail;
	protected String ownerName;

	Stall() {
	}

	public Stall(String stallName, String detail, String ownerName) {
		super();
		StallName = stallName;
		this.detail = detail;
		this.ownerName = ownerName;
	}

	public String getStallName() {
		return StallName;
	}

	public void setStallName(String stallName) {
		StallName = stallName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Double computeCost(String stallType, Integer squareFeet) {
		double cost;
		if (stallType.equals("Platinum")) {
			cost = squareFeet * 200;
			return cost;
		} else if (stallType.equals("Diamond")) {
			cost = squareFeet * 150;
			return cost;
		} else {
			cost = squareFeet * 100;
			return cost;
		}
	}

	public Double computeCost(String stallType, Integer squareFeet, Integer numberOfTV) {
		double cost;
		if (stallType.equals("Platinum")) {
			cost = (squareFeet * 200) + numberOfTV * 10000;
			return cost;
		} else if (stallType.equals("Diamond")) {
			cost = (squareFeet * 150) + numberOfTV * 10000;
			return cost;
		} else {
			cost = (squareFeet * 100) + numberOfTV * 10000;
			return cost;
		}
	}
}
