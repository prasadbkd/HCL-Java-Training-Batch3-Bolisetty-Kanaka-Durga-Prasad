package com.hcl.example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] s) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the side of square");
		double side = Double.parseDouble(br.readLine());
		Polygon p = new Square(side);
		System.out.println("Enter the length and breadth: ");
		double length = Double.parseDouble(br.readLine());
		double beadth = Double.parseDouble(br.readLine());
		Polygon ps = new Rectangle(length, beadth);
		System.out.println("The area of square is : " + p.calcArea());
		System.out.println("The perimeter of square is : " + p.calcPeri());
		System.out.println("The area of rectangle is : " + ps.calcArea());
		System.out.println("The perimeter of rectangle is : " + ps.calcPeri());
	}

}
