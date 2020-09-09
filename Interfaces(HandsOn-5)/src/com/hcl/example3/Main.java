package com.hcl.example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		String brand;
		int num, years;
		double cost = 5000.0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enetr your car number");
		num = Integer.parseInt(br.readLine());
		System.out.println("enter the car brand");
		brand = br.readLine();
		System.out.println("how many years old car do you have");
		years = Integer.parseInt(br.readLine());
		Car c = new Service();
		int day = c.sum(num);
		if (day % 2 == 0) {
			System.out.println("you can go on Tuesday, Thursday and Saturday");
		} else {
			System.out.println("you can go Monday, Wednesday, Friday, Sunday");
		}
		if (c.brand(brand).equals("maruthi")) {
			System.out.println(c.brand(brand));
			cost = cost - ((0.05) * cost);
			System.out.println("Your servicing charges are- " + cost);
		} else
			System.out.println("Your servicing charges are- " + cost);
		if (c.years(years) >= 5) {
			System.out.println("you are eligible for free service");
		} else
			System.out.println("you are not eligible for free service");

	}

}
