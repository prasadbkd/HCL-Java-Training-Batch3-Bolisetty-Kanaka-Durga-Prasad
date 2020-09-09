package com.hcl.example4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] s) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Axis /n2.Hdfc");
		System.out.println("select choice: ");
		int ch = Integer.parseInt(br.readLine());
		
		if(ch==1) {
		System.out.println("Enter the amount");
		double amount = Double.parseDouble(br.readLine());
		System.out.println("Enter the duration");
		int dur = Integer.parseInt(br.readLine());
		MutualFund f = new Axis(dur, amount);
		f.amount();
		}else if(ch==2) {
			System.out.println("Enter the amount");
			double amount = Double.parseDouble(br.readLine());
			System.out.println("Enter the duration");
			int dur = Integer.parseInt(br.readLine());
			MutualFund f = new Hdfc(dur, amount);
			f.amount();

		}
	}
}
