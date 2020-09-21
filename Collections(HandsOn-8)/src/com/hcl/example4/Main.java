package com.hcl.example4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<User> userList = new ArrayList<>();
		System.out.println("Enter number of Users: ");
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the user details: ");
			String details = br.readLine();
			String[] darray = details.split(",");
			userList.add(new User(darray[0], darray[1], darray[2]));
		}

		UserBO u = new UserBO();
		u.addAll(userList);
		System.out.println("Enter the range to be removed: ");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		//u.display(userList);
		u.removeUser(n1, n2);
		u.display(u);
	}

}
