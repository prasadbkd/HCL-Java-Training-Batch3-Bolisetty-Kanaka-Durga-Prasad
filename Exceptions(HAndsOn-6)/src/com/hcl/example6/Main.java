package com.hcl.example6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the cost of the item for n days");
		int cost = Integer.parseInt(br.readLine());
		System.out.println("Enter number of days: ");
		int n = Integer.parseInt(br.readLine());
		try {
			System.out.println("cost per unit is"+(cost)/n);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
	}

}
