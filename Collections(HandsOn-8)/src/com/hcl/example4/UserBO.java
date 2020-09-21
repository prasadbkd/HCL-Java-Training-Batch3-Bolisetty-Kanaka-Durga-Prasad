package com.hcl.example4;

import java.util.ArrayList;
import java.util.List;

public class UserBO extends ArrayList<User> {

	void removeUser(int n1,int n2) {
		removeRange(n1, n2);
	}

	void display(List<User> uList) {
		for (User u : uList)
			System.out.printf("%-20s %-20s %-20s\n", u.getUname(), u.getContactNumber(), u.getEmail());
	}

}
