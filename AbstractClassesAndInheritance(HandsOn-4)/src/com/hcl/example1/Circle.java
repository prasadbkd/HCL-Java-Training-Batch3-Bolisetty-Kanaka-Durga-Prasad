package com.hcl.example1;

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

		

		perimeter = 2 * 3.14 * this.radius;
		return perimeter;
	}
}
