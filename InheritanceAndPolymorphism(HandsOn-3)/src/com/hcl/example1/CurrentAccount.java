package com.hcl.example1;

public class CurrentAccount extends Account {

	private String tinNumber;

	public CurrentAccount() {
	}

	public CurrentAccount(String accName, String accNum, String bankName, String tinNumber) {
		super(accName, accNum, bankName);
		this.tinNumber = tinNumber;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public void display() {
		super.display();
		System.out.println("Tin Number: " + tinNumber);
	}
}
