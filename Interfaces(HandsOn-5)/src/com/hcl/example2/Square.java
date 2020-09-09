package com.hcl.example2;

public class Square implements Polygon {

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
	public double calcArea() {

		double area = this.side * this.side;
		return area;
	}

	@Override
	public double calcPeri() {

		double peri = 4 * this.side;
		return peri;

	}

}
