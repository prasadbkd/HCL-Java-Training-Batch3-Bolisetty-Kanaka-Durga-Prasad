package com.hcl.example3;

public class Tablet extends Medicine {

	public Tablet() {
		super();
	}

	public Tablet(String name, double price, String expiryDate) {
		super(name, price, expiryDate);
	}

	@Override
	public void getLable() {

		System.out.println("Store in cool place");
	}

}
