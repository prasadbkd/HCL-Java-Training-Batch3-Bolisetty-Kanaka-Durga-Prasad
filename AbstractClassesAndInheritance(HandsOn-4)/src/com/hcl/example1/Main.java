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
				Shape c = new Circle();
				System.out.printf("The Perimeter of circle is %.2f", c.calculatePerimeter());
			} else if (choice == 2) {
				Shape r = new Rectangle();
				System.out.printf("The Perimeter of Rectangle is %.2f", r.calculatePerimeter());
			} else if (choice == 3) {
				Shape s = new Square();
				System.out.printf("The Perimeter of Square is %.2f", s.calculatePerimeter());
			} else if (choice == 4) {
				System.out.println("Thank you");
				break;
			}
		}
	}

}
