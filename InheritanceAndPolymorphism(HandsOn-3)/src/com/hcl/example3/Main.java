package com.hcl.example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		String sname, detail, ownerName, type;
		String choice;
		int tvs, sqft;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the store name: ");
		sname = br.readLine();
		System.out.println("Enter the details: ");
		detail = br.readLine();
		System.out.println("Enter the Owner name: ");
		ownerName = br.readLine();
		Stall s = new Stall(sname, detail, ownerName);
		System.out.println("Enter the store type:(Platinum or Diamond or Gold) ");
		type = br.readLine();
		System.out.println("Enter size in sq feet");
		sqft = Integer.parseInt(br.readLine());
		System.out.println("Does store has tvs???? ");
		choice = br.readLine();
		if (choice.equals("y")) {
			System.out.println("Enter the num of tvs");
			tvs = Integer.parseInt(br.readLine());
			double cost = s.computeCost(type, sqft, tvs);
			System.out.println("The cost of stall is: " + cost);
		} else {
			double cost = s.computeCost(type, sqft);
			System.out.println("The cost of stall is: " + cost);
		}
	}

}
