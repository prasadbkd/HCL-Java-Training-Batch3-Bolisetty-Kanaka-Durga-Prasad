package com.hcl.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.nio.Buffer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		System.out.println("1. Savings Account \n2. Current Account");
		choice = Integer.parseInt(br.readLine());
		if (choice == 1) {
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name): ");
			String s = br.readLine();
			String detailsArray[] = s.split(",");
			SavingsAccount sa = new SavingsAccount(detailsArray[0], detailsArray[1], detailsArray[2], detailsArray[3]);
			sa.display();
		} else if (choice == 2) {
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,Tin Number): ");
			String s = br.readLine();
			String detailsArray[] = s.split(",");
			CurrentAccount ca = new CurrentAccount(detailsArray[0], detailsArray[1], detailsArray[2], detailsArray[3]);
			ca.display();
		}
	}

}
