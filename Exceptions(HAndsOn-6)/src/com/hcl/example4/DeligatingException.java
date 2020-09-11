package com.hcl.example4;

public class DeligatingException {
	public void divide(int a[], int d) throws ArithmeticException {

		for (int i = 0; i < a.length; i++) {

			System.out.println("Result: " + a[i] / d);

		}

	}
}
