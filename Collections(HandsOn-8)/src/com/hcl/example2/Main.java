package com.hcl.example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<ItemType> nameList = new ArrayList<ItemType>();
		int no = 1;
		String choice;
		while (true) {
			System.out.println("Enter the Item name " + no);
			String s = br.readLine();
			System.out.println("Enter the Deposit " + no);
			double d = Double.parseDouble(br.readLine());
			System.out.println("Enter the Cost per day " + no);
			double costPerDay = Double.parseDouble(br.readLine());
			no++;
			nameList.add(new ItemType(s, d, costPerDay));
			System.out.println("Do you want to continue (y/n)");
			choice = br.readLine();
			if (choice.equals("y"))
				continue;
			else if (choice.equals("n"))
				break;

		}
		System.out.printf("%-20s %-20s %-20s\n", "name", "deposit","cost per day");
		for (ItemType ss : nameList)
			System.out.printf("%-20s %-20s %-20s\n", ss.getName(), ss.getDeposit(), ss.getCostPerDay());
	}

}
