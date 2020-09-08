package com.hcl.example1;

public class SavingsAccount extends Account {

	private String orgName;

	public SavingsAccount() {
	}

	public SavingsAccount(String accName, String accNum, String bankName, String orgName) {
		super(accName, accNum, bankName);
		this.orgName = orgName;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public void display() {
		super.display();
		System.out.println("Org Name: " + orgName);
	}
}
