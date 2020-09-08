package com.hcl.example1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Square extends Shape {
	private double side;

	public Square() {
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the side: ");
			this.setSide(Double.parseDouble(br.readLine()));
		} catch (Exception e) {
		}
		perimeter = 4 * side;
		return perimeter;
	}

}
