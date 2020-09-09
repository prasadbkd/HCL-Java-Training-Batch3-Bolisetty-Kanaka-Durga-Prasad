package com.hcl.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int type;
		System.out.println("Select Type ");
		System.out.println("1.Premium \n2.Gold \n3.Executive");
		type = Integer.parseInt(br.readLine());
		if (type == 2) {
			System.out.println("Enter the Stall name: ");
			String sname = br.readLine();
			System.out.println("Enter the owner name");
			String oname = br.readLine();
			System.out.println("Enter cost");
			int cost = Integer.parseInt(br.readLine());
			System.out.println("Enter no of TV's:");
			int ntv = Integer.parseInt(br.readLine());
			Stall s = new GoldStall(sname, oname, cost, ntv);
			s.display();
		} else if (type == 1) {
			System.out.println("Enter the Stall name: ");
			String sname = br.readLine();
			System.out.println("Enter the owner name");
			String oname = br.readLine();
			System.out.println("Enter cost");
			int cost = Integer.parseInt(br.readLine());
			System.out.println("Enter no of Projectors:");
			int np = Integer.parseInt(br.readLine());
			Stall s = new PremiumStall(sname, oname, cost, np);
			s.display();
		} else if (type == 3) {
			System.out.println("Enter the Stall name: ");
			String sname = br.readLine();
			System.out.println("Enter the owner name");
			String oname = br.readLine();
			System.out.println("Enter cost");
			int cost = Integer.parseInt(br.readLine());
			System.out.println("Enter no of Screens:");
			int ns = Integer.parseInt(br.readLine());
			Stall s = new ExecutiveStall(sname, oname, cost, ns);
			s.display();
		}
	}

}
