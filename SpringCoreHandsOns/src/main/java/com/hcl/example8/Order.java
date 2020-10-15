package com.hcl.example8;

import org.springframework.stereotype.Component;

@Component
public class Order {

	private String itemName;
	private double price;

	public Order() {
	}

	public Order(String itemName, double price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}
	
	public String getItemName() {
		return itemName;
	}

	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order itemName: " + itemName + "\nprice: " + price ;
	}
	
	

}
