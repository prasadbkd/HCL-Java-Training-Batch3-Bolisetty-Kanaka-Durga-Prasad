package com.hcl.example15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<User> hl = new ArrayList<>();
		System.out.println("Enter the num of users");
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			System.out.println("enter the user " + (i + 1) + " detals (name,username,email,password): ");
			String details = br.readLine();
			String[] darray = details.split(",");
			User a = new User(darray[0], darray[1], darray[2], darray[3]);
			hl.add(a);
		}
		User u = new User();
		System.out.println("\n1.Name \n2.Email");
		System.out.println("Enter the choice: ");
		int choice = Integer.parseInt(br.readLine());
		if (choice == 1) {
			System.out.println("Enter the name to search: ");
			String name = br.readLine();
			User user = u.searchUserbyName(hl, name);
			System.out.println(user);
			int us = Collections.binarySearch(hl, user, new NameComparator());
			System.out.println(us);
			System.out.println(hl.get(us));
		} else if (choice == 2) {
			System.out.println("Enter the email to search: ");
			String email = br.readLine();
			User user = u.searchUserbyEmail(hl, email);
			int us = Collections.binarySearch(hl, user, new EmailComparator());
			System.out.println(hl.get(us));
		} else
			System.out.println("INVALID CHOICE");

	}
}
