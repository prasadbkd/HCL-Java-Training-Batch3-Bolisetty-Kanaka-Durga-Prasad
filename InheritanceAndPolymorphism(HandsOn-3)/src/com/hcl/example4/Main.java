package com.hcl.example4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int choice;
		System.out.println("1.Circle \n2.Rectangle \n3.Triangle");
		System.out.println("Enter the choice");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		choice = Integer.parseInt(br.readLine());
		if (choice == 1) {
			System.out.println("Enter the radius: ");
			int radius = Integer.parseInt(br.readLine());
			Circle c = new Circle(radius);
			c.computeArea();
		} else if (choice == 2) {
			System.out.println("Enter the length: ");
			double length = Double.parseDouble(br.readLine());
			System.out.println("Enter the breadth : ");
			double breadth = Double.parseDouble(br.readLine());
			Rectangle r = new Rectangle(length, breadth);
			r.computeArea();
		} else if (choice == 3) {
			System.out.println("Enter the base: ");
			double base = Double.parseDouble(br.readLine());
			System.out.println("Enter the height : ");
			double height = Double.parseDouble(br.readLine());
			Triangle t = new Triangle(base, height);
			t.computeArea();
		} else {
			System.out.println("Invalid choice");
		}
	}

}
