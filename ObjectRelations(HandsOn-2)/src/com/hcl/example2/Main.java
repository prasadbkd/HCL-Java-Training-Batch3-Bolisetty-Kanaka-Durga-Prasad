package com.hcl.example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static Product buildPRoduct() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int product_code;
		String product_name;
		double price;
		int stock;
		System.out.println("Enter Product Code: ");
		product_code = Integer.parseInt(br.readLine());
		System.out.println("Enter Product Name: ");
		product_name = br.readLine();
		System.out.println("Enter Product Price: ");
		price = Double.parseDouble(br.readLine());
		System.out.println("Enter Product Stock: ");
		stock = Integer.parseInt(br.readLine());
		Product p = new Product(product_code, product_name, price, stock);
		return p;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Product p, q;
		p = Main.buildPRoduct();
		q = Main.buildPRoduct();
		System.out.println("Product Details:");
		System.out.println(p.getName());
		System.out.println("Product code: " + p.getProduct_code());
		System.out.println("Product Name: " + p.getProduct_name());
		System.out.println("Product Price: " + p.getPrice());
		System.out.println("Product Stock: " + p.getStock());
		System.out.println("Discounted Price: " + p.getDiscountePrice(p.getPrice()));
		System.out.println();
		System.out.println(p.getName());
		System.out.println("Product code: " + q.getProduct_code());
		System.out.println("Product Name: " + q.getProduct_name());
		System.out.println("Product Price: " + q.getPrice());
		System.out.println("Product Stock: " + q.getStock());
		System.out.println("Discounted Price: " + q.getDiscountePrice(q.getPrice()));
		System.out.println(Product.checkPrice(p, q));
	}

}
