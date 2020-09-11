package com.hcl.example2;

public class DBZException {

	public void devide(int[] a, int n) {
		try {
			for (int i = 0; i < a.length; i++) {
				System.out.println("Result: " + a[i] / n);
			}
		} catch (ArithmeticException ae) {
			System.out.println("Cannot Devide by 0");
		}
	}
}
