package com.hcl.example4;

import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;

public class Circle extends Shape {

	private int radius;

	public void computeArea() {
		System.out.println("Enter the radius: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			radius = Integer.parseInt(br.readLine());
		} catch (Exception e) {
		}
		super.area = 3.14 * radius * radius;
		System.out.printf("The area of circle is %.2f", area);
	}
}