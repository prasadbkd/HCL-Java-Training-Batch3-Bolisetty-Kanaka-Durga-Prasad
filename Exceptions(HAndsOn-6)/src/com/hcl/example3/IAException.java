package com.hcl.example3;

public class IAException {
	public void divide(int a[], int d) {

		for (int i = 0; i < a.length; i++) {
			try {
				if ((a[i] % 2 == 0 && d % 2 == 0) || (a[i] % 2 != 0 && d % 2 != 0)) {
					System.out.println("Result: " + a[i] / d);
				} else {
					throw new IllegalArgumentException("Result: " + a[i] / d);
				}
			} catch (IllegalArgumentException ie) {
				System.out.println("Exception handled");
				//System.out.println(ie.getLocalizedMessage());
				System.out.println(ie.getMessage());
			}

		}
	}
}