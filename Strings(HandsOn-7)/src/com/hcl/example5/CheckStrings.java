package com.hcl.example5;

public class CheckStrings {

	public void concat(String str1, String str2) {
		String str3 = str1 + "." + str2;
		System.out.println("Concatinated String " + str3);
	}

	public void removeString(String s1, String s2) {
		s1 = s1.replaceAll(s2, "");
		System.out.println("Dumpty's sentence : "+s1);
	}
}
