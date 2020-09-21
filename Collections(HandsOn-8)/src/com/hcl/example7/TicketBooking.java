package com.hcl.example7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TicketBooking {

	private String name;
	private int price;

	public TicketBooking() {
	}

	public TicketBooking(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("name: %s, price: %s", name, price);
	}

	void minPrice(List<TicketBooking>tb) {
		List <Integer> li = new ArrayList<Integer>();
		for(TicketBooking t : tb) {
			li.add(t.getPrice());	
		}
		int x  = li.indexOf(Collections.min(li));
		System.out.println("The min price ticket was bought by "+tb.get(x).toString());
	}
}
