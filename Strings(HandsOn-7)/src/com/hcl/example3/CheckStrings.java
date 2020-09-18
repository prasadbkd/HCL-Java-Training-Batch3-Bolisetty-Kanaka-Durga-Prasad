package com.hcl.example3;

public class CheckStrings {

	public void concat(String str1, String str2) {

		String str3 = str1 + "." + str2;
		System.out.println("Concatinated String " + str3);
	}

	public boolean stringContainWord(String str1, String str2) {

		return str1.contains(str2);
	}

	public void reverseString(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println("Dumpty says, " + sb);
		// char[] charray = str.toCharArray();
		// for (int i = charray.length-1; i >= 0; i--) {
		// System.out.print(charray[i]);

		// }
	}
}
