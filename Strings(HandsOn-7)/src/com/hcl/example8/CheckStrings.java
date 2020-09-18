package com.hcl.example8;

public class CheckStrings {

	public void concat(String str1, String str2) {
		String str3 = str1 + "." + str2;
		System.out.println("Concatinated String " + str3);
	}
	
	public void changeCases(String str) {
		char[] carray = str.toCharArray();
		int count=0;
		for(int i=0;i<carray.length;i++) {
			if(Character.isUpperCase(carray[i]))
				count++;
		}
		if(count==carray.length) {
			System.out.println(str.toLowerCase());
		}
		else {
			System.out.println(str.toUpperCase());
		}
	}
}
