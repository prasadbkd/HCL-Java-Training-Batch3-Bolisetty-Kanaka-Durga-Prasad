package com.hcl.example4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangle extends Shape {

	private double base;
	private double height;

	public void computeArea() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the base: ");
			base = Double.parseDouble(br.readLine());
			System.out.println("Enter the height : ");
			height = Double.parseDouble(br.readLine());
		} catch (Exception e) {
		}
		super.area = (base * height) / 2;
		System.out.printf("The area Triangle is %.2f", area);
	}

}
