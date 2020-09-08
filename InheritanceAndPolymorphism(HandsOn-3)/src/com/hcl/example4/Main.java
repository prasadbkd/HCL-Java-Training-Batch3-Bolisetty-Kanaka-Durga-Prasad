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
			Circle c = new Circle();
			c.computeArea();
		} else if (choice == 2) {
			Rectangle r = new Rectangle();
			r.computeArea();
		} else if (choice == 3) {
			Triangle t = new Triangle();
			t.computeArea();
		} else {
			System.out.println("Invalid choice");
		}
	}

}
