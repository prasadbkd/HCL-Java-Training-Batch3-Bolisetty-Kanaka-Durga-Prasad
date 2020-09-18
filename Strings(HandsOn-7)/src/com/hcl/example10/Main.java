package com.hcl.example10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the 1st address");
		String address1 = br.readLine();
		System.out.println("Enter the 2nd address");
		String address2 = br.readLine();
		if (address1.equals(address2)) {
			System.out.println("RED");
		} else if (address1.equalsIgnoreCase(address2)) {
			System.out.println("BLUE");
		} else if (address1.replaceAll(" ", "").equals(address2.replaceAll(" ", ""))) {
			System.out.println("YELLOW");
		} else {
			System.out.println("GREEN");
		}
	}

}
