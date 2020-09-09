package com.hcl.example4;

public class Triangle extends Shape {

	private double base;
	private double height;

	public Triangle() {
	}

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public void computeArea() {

		super.area = (this.base * this.height) / 2;
		System.out.printf("The area Triangle is %.2f", area);
	}

}
