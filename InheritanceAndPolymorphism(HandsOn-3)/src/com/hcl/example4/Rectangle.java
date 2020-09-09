package com.hcl.example4;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

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

	public void computeArea() {

		super.area = this.length * this.breadth;
		System.out.printf("The area Rectangle is %.2f", area);
	}
}
