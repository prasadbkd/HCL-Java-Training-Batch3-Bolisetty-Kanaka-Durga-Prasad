package com.hcl.example9;

import java.util.Collections;
import java.util.List;

public class Hall {
	private String name;
	private String contactNumber;
	private double ncostPerDay;
	private String ownerName;

	public Hall() {
	}

	public Hall(String name, String contactNumber, double ncostPerDay, String ownerName) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.ncostPerDay = ncostPerDay;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public double getNcostPerDay() {
		return ncostPerDay;
	}

	public void setNcostPerDay(double ncostPerDay) {
		this.ncostPerDay = ncostPerDay;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return String.format("Hall [name=%s, contactNumber=%s, ncostPerDay=%s, ownerName=%s]", name, contactNumber,
				ncostPerDay, ownerName);
	}

	public void sortPrice(List<Hall> hl) {
		Collections.sort(hl, (p, q) -> {
			if (p.getNcostPerDay() == q.getNcostPerDay())
				return 0;
			else if (p.getNcostPerDay() > q.getNcostPerDay())
				return 1;
			else
				return -1;
		});
	}

	public void display(List<Hall> hl) {
		System.out.println("Hall from least expensive to more expensive");
		for (Hall hh : hl) {
			System.out.printf("\n %-15s%-15s%-15s%-15s", hh.getName(), hh.getContactNumber(), hh.getNcostPerDay(),
					hh.getOwnerName());
		}
	}
}
