package com.hcl.example9;

public class CheckStrings {

	public void concat(String str1, String str2) {
		String str3 = str1 + "." + str2;
		System.out.println("Concatinated String " + str3);
	}
	
	public void checkIfUpperCase(String str) {
		char[] carray = str.toCharArray();
		int count=0;
		for(int i=0;i<carray.length;i++) {
			if(Character.isUpperCase(carray[i]))
				count++;
		}
		if(count==carray.length) {
			System.out.println("String is in uppercase");
		}
		else {
			System.out.println("String is not in uppercase");
		}
	}
}
