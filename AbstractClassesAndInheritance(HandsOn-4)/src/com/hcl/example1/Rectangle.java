package com.hcl.example1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rectangle extends Shape {
	private double length;
	private double breadth;

	public Rectangle() {
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double calculatePerimeter() {
		double perimeter;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the length: ");
			length = Double.parseDouble(br.readLine());
			System.out.println("Enter the breadth : ");
			breadth = Double.parseDouble(br.readLine());
		} catch (Exception e) {
		}
		perimeter = 2 * (length + breadth);
		return perimeter;
	}
}
