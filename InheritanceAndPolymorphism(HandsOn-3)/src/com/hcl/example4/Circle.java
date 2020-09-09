package com.hcl.example4;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

public class Circle extends Shape {

	private int radius;

	public Circle() {
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public void computeArea() {

		super.area = 3.14 * this.radius * this.radius;
		System.out.printf("The area of circle is %.2f", area);
	}
}