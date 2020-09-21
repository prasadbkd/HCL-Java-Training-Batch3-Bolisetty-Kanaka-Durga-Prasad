package com.hcl.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> nameList = new ArrayList<String>();
		int no = 1;
		String choice;
		while (true) {
			System.out.println("Enter the username " + no);
			String s = br.readLine();
			nameList.add(s);
			no++;
			System.out.println("Do you want to continue (y/n)");
			choice = br.readLine();
			if (choice.equals("y"))
				continue;
			else if (choice.equals("n"))
				break;

		}
		for (String ss : nameList)
			System.out.println(ss);
	}

}
