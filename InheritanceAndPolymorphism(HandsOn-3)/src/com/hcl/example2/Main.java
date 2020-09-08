package com.hcl.example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		String detail;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(
				"Enter Account Details:(accountNumber,balance,accountHolderName,minimunBalance,lockingPeriod) ");
		detail = br.readLine();
		AccountBO ab = new AccountBO();
		FixedAccount fa = ab.getAccountDetail(detail);
		System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
		System.out.format("%-20s %-10s %-20s %-20s %s\n", fa.getAccNumber(), fa.getBalance(), fa.getAccName(),
				fa.getMinBal(), fa.getLockingPeriod());
	}

}
