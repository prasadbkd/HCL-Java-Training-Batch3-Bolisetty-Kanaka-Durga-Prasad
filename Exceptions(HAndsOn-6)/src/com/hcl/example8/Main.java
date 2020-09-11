package com.hcl.example8;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter Integer input");
			int n = s.nextInt();
			System.out.println("Entered value is " + n);
		} catch (InputMismatchException ime) {
			System.out.println(ime);
		}
	}
}