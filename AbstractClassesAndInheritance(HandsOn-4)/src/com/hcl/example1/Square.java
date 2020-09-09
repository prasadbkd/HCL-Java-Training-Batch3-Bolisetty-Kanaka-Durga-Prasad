package com.hcl.example1;

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
		
		perimeter = 4 * this.side;
		return perimeter;
	}

}
