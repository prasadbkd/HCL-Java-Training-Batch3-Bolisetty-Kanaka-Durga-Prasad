package com.hcl.example1;

import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;

public class Circle extends Shape {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calculatePerimeter() {
		double perimeter;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Eneter the radius: ");
			this.setRadius(Double.parseDouble(br.readLine()));
		} catch (Exception e) {
		}
		perimeter = 2 * 3.14 * radius;
		return perimeter;
	}
}
