package com.hcl.example13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		List<ArrayList<Integer>> tickets = new ArrayList<ArrayList<Integer>>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 5;
		System.out.println("Enter count of booked tickets");
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> al = new ArrayList<>();
			System.out.println("On day "+(i+1));
			String s = br.readLine();
			String[] aa = s.split(",");
			// int a[] = new int[aa.length];
			for (int j = 0; j < aa.length; j++) {
				int k = Integer.parseInt(aa[j]);
				al.add(k);
			}
			tickets.add(al);
		}
		while (true) {
			System.out.println("Enter the day to know the remaining ticket count");
			int k = Integer.parseInt(br.readLine());

			ArrayList<Integer> al = new ArrayList<>();
			al = tickets.get(k-1);
			int a[] = new int[al.size()];
			for (int m = 0; m < a.length; m++) {
				a[m] = 100 - al.get(m);
			}
			for (int i : a)
				System.out.print(i + " ");
			System.out.println("\nDo you want to continue (y/n)");
			String choice = br.readLine();
			if (choice.equals("y"))
				continue;
			else if (choice.equals("n"))
				System.out.println("Thank you");
				break;
		}

		

	}

}
