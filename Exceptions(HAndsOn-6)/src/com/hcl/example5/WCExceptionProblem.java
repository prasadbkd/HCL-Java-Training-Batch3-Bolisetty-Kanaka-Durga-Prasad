package com.hcl.example5;

public class WCExceptionProblem {

	public void divide(int a[], int d) throws WrongComboException {

		for (int i = 0; i < a.length; i++) {

			if ((a[i] % 2 == 0 && d % 2 == 0) || (a[i] % 2 != 0 && d % 2 != 0)) {
				System.out.println("Result: " + a[i] / d);
			} else {
				throw new WrongComboException("Invalid Combination: " + a[i] + " " + d);
			}

		}
	}
}
