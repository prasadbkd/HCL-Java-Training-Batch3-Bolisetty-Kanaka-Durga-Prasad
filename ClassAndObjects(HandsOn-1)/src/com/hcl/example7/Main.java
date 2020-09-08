package com.hcl.example7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name, extraDetails;
		long runs;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Extra Type Details");
		extraDetails = s.nextLine();
		String[] details = extraDetails.split("#");
		name = details[0];
		runs = Long.parseLong(details[1]);
		ExtraType e = new ExtraType();
		e.setName(name);
		e.setRuns(runs);
		System.out.println("Extra Type Details: ");
		System.out.println("Extra type: " + e.getName());
		System.out.println("Runs: " + e.getRuns());

	}

}
