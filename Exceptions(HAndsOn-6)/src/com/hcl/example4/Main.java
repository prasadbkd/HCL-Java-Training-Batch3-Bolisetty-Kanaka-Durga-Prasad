package com.hcl.example4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hcl.example3.IAException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[10];
		int d;
		System.out.println("Enter any 10 values : ");
		for (int i = 0; i < 10; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the Divisor : ");
		d = Integer.parseInt(br.readLine());
		IAException ie = new IAException();
		try {
			ie.divide(a, d);
		} catch (ArithmeticException ae) {
			System.out.println("Main method handled Exception");
		}

	}
}
