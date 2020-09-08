package com.hcl.example2;

public class Account {

	protected String accNumber;
	protected Double balance;
	protected String accName;

	public Account() {
	}

	public Account(String accNumber, Double balance, String accName) {
		super();
		this.accNumber = accNumber;
		this.balance = balance;
		this.accName = accName;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

}
