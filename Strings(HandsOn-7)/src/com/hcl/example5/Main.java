package com.hcl.example5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Dumpty's sentence: ");
		String str1 = br.readLine();
		System.out.println("what humpty wants to be removed ");
		String str2 = br.readLine();
		CheckStrings cs = new CheckStrings();
		// cs.concat(str1, str2);
		cs.removeString(str1, str2);
	}

}
