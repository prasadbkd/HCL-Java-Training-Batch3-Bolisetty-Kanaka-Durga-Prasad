package com.hcl.example4;

public class CheckStrings {

	public void concat(String str1, String str2) {
		String str3 = str1 + "." + str2;
		System.out.println("Concatinated String " + str3);
	}

	public void replaceString(String s1, String s2, String s3) {
		s1 = s1.replaceAll(s2, s3);
		System.out.println(s1);
	}
}
