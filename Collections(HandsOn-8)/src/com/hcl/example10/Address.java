package com.hcl.example10;

import java.util.List;

public class Address implements Comparable {

	private String username;
	private String addressLine1;
	private String addressLine2;
	private int pinCode;

	public Address() {
	}

	public Address(String username, String addressLine1, String addressLine2, int pinCode) {
		super();
		this.username = username;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pinCode = pinCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return String.format("username: %s, addressLine1: %s, addressLine2: %s, pinCode: %s", username, addressLine1,
				addressLine2, pinCode);
	}

	@Override
	public int compareTo(Object o) {
		Address a = (Address) o;
		if (this.getPinCode() > a.getPinCode())
			return 1;
		else if (this.getPinCode() == a.getPinCode()) {
			return this.getAddressLine1().compareTo(a.getAddressLine1());
		} else
			return -1;
	}

	public static void display(List<Address> a) {
		System.out.println("User details");
		for (Address aa : a) {
			System.out.println(aa);
		}
	}
}
