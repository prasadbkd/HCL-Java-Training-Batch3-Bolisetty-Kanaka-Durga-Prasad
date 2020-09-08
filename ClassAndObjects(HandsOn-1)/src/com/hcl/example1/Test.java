package com.hcl.example1;

import java.util.Scanner;

public class Test {

	private static Scanner s;

	public static void main(String[] args) {
		String venue_name, city;
		s = new Scanner(System.in);
		System.out.println("Enter the venue name: ");
		venue_name = s.nextLine();
		System.out.println("Enter the city name: ");
		city = s.nextLine();
		Venue v = new Venue(venue_name, city);
		System.out.println(v);
	}

}
