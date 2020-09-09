package com.hcl.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		System.out.println("1.Circle \n2.Rectangle \n3.Square \n4.Exit");
		while (true) {
			System.out.println("\nenter the choice");
			choice = Integer.parseInt(br.readLine());
			if (choice == 1) {
				System.out.println("Enter the radius: ");
				int radius = Integer.parseInt(br.readLine());
				Shape c = new Circle(radius);
				System.out.printf("The Perimeter of circle is %.2f", c.calculatePerimeter());
			} else if (choice == 2) {
				System.out.println("Enter the length: ");
				double length = Double.parseDouble(br.readLine());
				System.out.println("Enter the breadth : ");
				double breadth = Double.parseDouble(br.readLine());
				Shape r = new Rectangle(length, breadth);
				System.out.printf("The Perimeter of Rectangle is %.2f", r.calculatePerimeter());
			} else if (choice == 3) {
				System.out.println("Enter the side: ");
				int side = Integer.parseInt(br.readLine());
				Shape s = new Square(side);
				System.out.printf("The Perimeter of Square is %.2f", s.calculatePerimeter());
			} else if (choice == 4) {
				System.out.println("Thank you");
				break;
			}
		}
	}

}
