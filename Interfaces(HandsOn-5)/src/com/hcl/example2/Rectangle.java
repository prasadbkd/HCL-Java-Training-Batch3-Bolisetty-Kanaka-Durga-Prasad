package com.hcl.example2;

public class Rectangle implements Polygon {

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

	@Override
	public double calcArea() {
		double area = this.length * this.breadth;
		return area;
	}

	@Override
	public double calcPeri() {
		double peri = 2 * (this.length + this.breadth);
		return peri;
	}

}
