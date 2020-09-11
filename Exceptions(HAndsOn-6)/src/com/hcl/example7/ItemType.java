package com.hcl.example7;

public class ItemType {

	private String name;
	private double deposi;
	private double costPerDay;

	public ItemType() {
	}

	public ItemType(String name, double deposi, double costPerDay) {
		super();
		this.name = name;
		this.deposi = deposi;
		this.costPerDay = costPerDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposi() {
		return deposi;
	}

	public void setDeposi(double deposi) {
		this.deposi = deposi;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	@Override
	public String toString() {
		return String.format("The details of the Item : \nItem name=%s \ndeposi=%s \ncostPerDay=%s", name, deposi,
				costPerDay);
	}

}
