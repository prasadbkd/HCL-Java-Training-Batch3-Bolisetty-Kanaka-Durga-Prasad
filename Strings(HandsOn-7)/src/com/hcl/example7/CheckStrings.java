package com.hcl.example7;

public class CheckStrings {

	public void concat(String str1, String str2) {
		String str3 = str1 + "." + str2;
		System.out.println("Concatinated String " + str3);
	}
	public void countWords(String s1,String s2) {
		String[] humptyArray = s1.split(" ");
		String[] dumptyArray = s2.split(" ");
		if(humptyArray.length>dumptyArray.length) {
			System.out.println("Humpty used more words");
		}else if(humptyArray.length==dumptyArray.length) {
			System.out.println("Both used same words");
		}
		else {
			System.out.println("Dumpty used more words");
		}
	}
}
