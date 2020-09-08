package com.hcl.example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] s) throws IOException {
		int type;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name of event: ");
		String name = br.readLine();
		System.out.println("Enter details of event: ");
		String detail = br.readLine();
		System.out.println("Enter owner name of event: ");
		String owner = br.readLine();
		System.out.println("Enter type of event: ");
		System.out.println("1.Exhibition \n2.Stage Event");
		type = Integer.parseInt(br.readLine());
		if (type == 1) {
			System.out.println("Enter no of stalls: ");
			int noOfStalls = Integer.parseInt(br.readLine());
			Exhibition ex = new Exhibition(name, detail, owner, noOfStalls);
			System.out.printf("The projected revenue is %.2f " , ex.projectedRevenue());
		} else if (type == 2) {
			System.out.println("Enter no of shows: ");
			int noOfShows = Integer.parseInt(br.readLine());
			System.out.println("Enter no of seats: ");
			int noOfSeatsPerShow = Integer.parseInt(br.readLine());
			StageEvent se = new StageEvent(name, detail, owner, noOfShows, noOfSeatsPerShow);
			System.out.printf("The projected revenue is %.2f " , se.projectedRevenue());
		}
	}
}
