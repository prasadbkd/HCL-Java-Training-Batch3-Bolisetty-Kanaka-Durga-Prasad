package com.hcl.example1;

public class Account {

	protected String accName;
	protected String accNum;
	protected String bankName;

	public Account() {
	}

	public Account(String accName, String accNum, String bankName) {
		super();
		this.accName = accName;
		this.accNum = accNum;
		this.bankName = bankName;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void display() {
		System.out.println("Account name: " + accName);
		System.out.println("Account num: " + accNum);
		System.out.println("Bank name: " + bankName);
	}

}
