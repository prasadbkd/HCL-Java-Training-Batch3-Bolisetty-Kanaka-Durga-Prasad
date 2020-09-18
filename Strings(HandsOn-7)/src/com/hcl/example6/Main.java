package com.hcl.example6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Humpty's sentence: ");
		String str1 = br.readLine();
		System.out.println("Enter Dumpty's word to add: ");
		String str2 = br.readLine();
		System.out.println("Enter position to add: ");
		int pos = Integer.parseInt(br.readLine());
		CheckStrings cs = new CheckStrings();
		// cs.concat(str1, str2);
		cs.insertString(str1, str2, pos);
	}

}
