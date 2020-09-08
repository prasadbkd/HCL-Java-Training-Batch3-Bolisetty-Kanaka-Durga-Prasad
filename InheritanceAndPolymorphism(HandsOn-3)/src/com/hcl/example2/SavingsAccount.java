package com.hcl.example2;

public class SavingsAccount extends Account {

	protected double minBal;

	SavingsAccount() {
	}

	public SavingsAccount(String accNumber, Double balance, String accName, double minBal) {
		super(accNumber, balance, accName);
		this.minBal = minBal;
	}

	public double getMinBal() {
		return minBal;
	}

	public void setMinBal(double minBal) {
		this.minBal = minBal;
	}

}
