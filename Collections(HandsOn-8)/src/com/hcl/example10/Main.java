package com.hcl.example10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Address> hl = new ArrayList<>();
		System.out.println("Enter the num of users");
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			System.out.println("enter the hall " + (i + 1) + " detals");
			String details = br.readLine();
			String[] darray = details.split(",");
			Address a = new Address(darray[0], darray[1], darray[2], Integer.parseInt(darray[3]));
			hl.add(a);
		}

		Collections.sort(hl);
		Address.display(hl);
	}

}
