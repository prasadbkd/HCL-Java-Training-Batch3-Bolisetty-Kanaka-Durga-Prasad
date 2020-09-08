package com.hcl.example4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rectangle extends Shape {
	private double length;
	private double breadth;

	public void computeArea() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the length: ");
			length = Double.parseDouble(br.readLine());
			System.out.println("Enter the breadth : ");
			breadth = Double.parseDouble(br.readLine());
		} catch (Exception e) {
		}
		super.area = length * breadth;
		System.out.printf("The area Rectangle is %.2f", area);
	}
}
