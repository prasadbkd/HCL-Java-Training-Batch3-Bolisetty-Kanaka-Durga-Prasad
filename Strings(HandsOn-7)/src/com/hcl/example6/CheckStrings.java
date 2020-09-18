package com.hcl.example6;

public class CheckStrings {

	public void concat(String str1, String str2) {
		String str3 = str1 + "." + str2;
		System.out.println("Concatinated String " + str3);
	}
	
	public void insertString(String s1,String s2,int pos) {
		
		StringBuilder sb = new StringBuilder(s1);
		sb.insert(pos-1,s2);
		System.out.println("Humpty's New Sentense : "+sb);
		
	}
}
