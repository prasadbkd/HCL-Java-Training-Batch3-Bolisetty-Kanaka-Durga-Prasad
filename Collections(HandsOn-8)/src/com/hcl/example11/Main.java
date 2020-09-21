package com.hcl.example11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
		System.out.println("/n1.Name /n2.Email");
		System.out.println("Enter the choice: ");
		int choice = Integer.parseInt(br.readLine());
		if (choice == 1) {
			u.sortName(hl);
			u.display(hl);
		} else if (choice == 2) {
			u.sortEmail(hl);
			u.display(hl);
		} else
			System.out.println("INVALID CHOICE");
	}
}
