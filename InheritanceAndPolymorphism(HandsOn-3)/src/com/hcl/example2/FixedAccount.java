package com.hcl.example2;

public class FixedAccount extends SavingsAccount {
	private int lockingPeriod;

	FixedAccount() {
	}

	public FixedAccount(String accNumber, Double balance, String accName, double minBal, int lockingPeriod) {
		super(accNumber, balance, accName, minBal);
		this.lockingPeriod = lockingPeriod;
	}

	public int getLockingPeriod() {
		return lockingPeriod;
	}

	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}

}
