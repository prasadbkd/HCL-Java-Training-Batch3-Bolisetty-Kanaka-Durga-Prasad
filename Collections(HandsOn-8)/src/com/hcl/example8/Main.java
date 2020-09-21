package com.hcl.example8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] s) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Stall> stall_list = new ArrayList<>();
		int no = Integer.parseInt(br.readLine());
		System.out.println("Enter the details ");
		for (int i = 0; i < no; i++) {
			String details = br.readLine();
			String darray[] = details.split(",");
			Stall stall = new Stall(darray[0], darray[1], darray[2], darray[3]);
			stall_list.add(stall);
		}
		Stall s1 = new Stall();
		s1.removeTest(stall_list);
		s1.display(stall_list);
	}
}
