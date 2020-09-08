package com.hcl.example5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int choice;
		String venue_name, city;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the venue name: ");
		venue_name = s.nextLine();
		System.out.println("Enter the city name: ");
		city = s.nextLine();
		Venue v = new Venue();
		v.setName(venue_name);
		v.setCity(city);
		while (true) {
			System.out.println("Menu");
			System.out.println(
					"1.Update Venue Name \r\n" + "2.Update City Name \r\n" + "3.All informations Correct/Exit");
			System.out.println("Type 1 or 2 or 3");
			choice = s.nextInt();
			if (choice == 1) {
				System.out.println("Enter new venue name");
				s.nextLine();
				venue_name = s.nextLine();
				v.setName(venue_name);
				System.out.println("Venue name: " + v.getName());
				System.out.println("City name: " + v.getCity());
			} else if (choice == 2) {
				System.out.println("Enter new city name");
				s.nextLine();
				city = s.nextLine();
				v.setCity(city);
				System.out.println("Venue name: " + v.getName());
				System.out.println("City name: " + v.getCity());
			} else if (choice == 3) {
				System.out.println("Venue Details:");
				System.out.println("Venue name: " + v.getName());
				System.out.println("City name: " + v.getCity());
				break;
			}
		}
	}
}