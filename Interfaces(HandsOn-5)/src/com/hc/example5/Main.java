package com.hc.example5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Rajmachi \n2.Murudh \n3.Shivgadh");
		int ch = sc.nextInt();
		if (ch == 1) {
			Fort f = new Rajmachi();
			f.distance();
		} else if (ch == 2) {
			Fort f = new Murudh();
			f.distance();

		} else if (ch == 3) {
			Fort f = new Shivgadh();
			f.distance();
		}
	}
}
