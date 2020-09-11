package com.hcl.example1;

public class AIOBException {

	public void devide(int a[]) {
		int i = 0, j = 10;

		try {
			while (i >= 0) {
				System.out.println(a[i] / j);
				i++;
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Elements are over");
		}
	}
}