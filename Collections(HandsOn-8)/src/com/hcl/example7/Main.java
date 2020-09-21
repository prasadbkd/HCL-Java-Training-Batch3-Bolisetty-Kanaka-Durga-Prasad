package com.hcl.example7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<TicketBooking> tb=new ArrayList<TicketBooking>();
		System.out.println("Enter num of ticket details ");
		int no = Integer.parseInt(br.readLine());
		for (int i = 0; i < no; i++) {
			System.out.println("Enter ticket details");
			String details = br.readLine();
			String [] darray = details.split(",");
			tb.add(new TicketBooking(darray[0], Integer.parseInt(darray[1])));
		}

		TicketBooking t = new TicketBooking();
		t.minPrice(tb);
	}

}
