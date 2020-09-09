package com.hcl.example3;

public class Syrup extends Medicine {

	public Syrup() {
		super();
	}

	public Syrup(String name, double price, String expiryDate) {
		super(name, price, expiryDate);
	}

	public void getLable() {

		System.out.println("Take physician’s advice\r\n" + "Dosage :\r\n" + "Adult :2spoons twice a day\r\n"
				+ "Children : 1spoon twice a day\r\n");
	}
}
