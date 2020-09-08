package com.hcl.example1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int product_code;
		String product_name;
		double price;
		int stock;
		Product p = new Product();
		Product q = new Product();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter details of 1st Product");
		System.out.println("name:");
		product_name = s.nextLine();
		p.setProduct_name(product_name);
		System.out.println("code:");
		product_code = s.nextInt();
		p.setProduct_code(product_code);
		System.out.println("stock:");
		stock = s.nextInt();
		p.setStock(stock);
		System.out.println("price:");
		s.nextLine();
		price = s.nextDouble();
		p.setPrice(price);
		System.out.println("Enter details of 2nd product");
		System.out.println("name:");
		s.nextLine();
		product_name = s.nextLine();
		q.setProduct_name(product_name);
		System.out.println("code:");
		product_code = s.nextInt();
		q.setProduct_code(product_code);
		System.out.println("stock:");
		stock = s.nextInt();
		q.setStock(stock);
		System.out.println("price:");
		s.nextLine();
		price = s.nextDouble();
		q.setPrice(price);
		System.out.println();
		System.out.println("Product Details");
		System.out.println("\nProduct Code: " + p.getProduct_code());
		System.out.println("Name:" + p.getProduct_name());
		System.out.println("Price: " + p.getPrice());
		System.out.println("Stock: " + p.getStock());
		System.out.println("Product Code: " + q.getProduct_code());
		System.out.println("Name:" + q.getProduct_name());
		System.out.println("Price: " + q.getPrice());
		System.out.println("Stock: " + q.getStock());
		System.out.println("\n" + Product.checkPrice(p, q));

	}

}
