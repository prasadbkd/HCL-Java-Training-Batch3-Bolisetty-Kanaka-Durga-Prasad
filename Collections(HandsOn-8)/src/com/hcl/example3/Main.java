package com.hcl.example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> nameList = new ArrayList<String>();
		// int no = 1;
		// String choice;
		System.out.println("Enter number of Halls: ");
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the Hall name " + (i+1));
			String s = br.readLine();
			nameList.add(s);
		}
		System.out.println("Enter the Hall name to be searched ");
		String search = br.readLine();
		if (nameList.contains(search)) {
			System.out.println(search + " is found at position " + nameList.indexOf(search));
		} else
			System.out.println(search + " is not found");
		//for (String ss : nameList)
			//System.out.println(ss);
	}

}
