package com.hcl.example2;

public class CheckStrings {

	public void concat(String str1, String str2) {

		String str3 = str1 + "." + str2;
		System.out.println("Concatinated String " + str3);
	}

	public boolean stringContainWord(String str1, String str2) {

		return str1.contains(str2);
	}
}
