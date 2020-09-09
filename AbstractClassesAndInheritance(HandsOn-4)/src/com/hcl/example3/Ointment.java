package com.hcl.example3;

public class Ointment extends Medicine {

	public Ointment() {
		super();
	}

	public Ointment(String name, double price, String expiryDate) {
		super(name, price, expiryDate);
	}

	@Override
	public void getLable() {

		System.out.println("For external use only");
	}

}
