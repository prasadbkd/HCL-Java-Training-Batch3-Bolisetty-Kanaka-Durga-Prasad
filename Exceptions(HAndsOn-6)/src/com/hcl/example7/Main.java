package com.hcl.example7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String s[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter name of Item : ");
			String name = br.readLine();
			System.out.println("Enter cost of Item for n days: ");
			double deposit = Double.parseDouble(br.readLine());
			System.out.println("Enter cost of Item for 1 day: ");
			double cpday = Double.parseDouble(br.readLine());
			ItemType it = new ItemType(name, deposit, cpday);
			System.out.println(it);
		} catch (NumberFormatException ne) {
			System.out.println(ne);
		}

	}
}
