package com.hcl.example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static Product[] buildPRoduct(int n) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int product_code;
		String product_name;
		double price;
		int stock;
		Product[] productArray = new Product[n];
		for (int i = 0; i < productArray.length; i++) {
			System.out.println("Enter Product Code: ");
			product_code = Integer.parseInt(br.readLine());
			System.out.println("Enter Product Name: ");
			product_name = br.readLine();
			System.out.println("Enter Product Price: ");
			price = Double.parseDouble(br.readLine());
			System.out.println("Enter Product Stock: ");
			stock = Integer.parseInt(br.readLine());
			productArray[i] = new Product(product_code, product_name, price, stock);
		}
		return productArray;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = 0;
		Product p1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of products: ");
		n = Integer.parseInt(br.readLine());
		Product[] p = Main.buildPRoduct(n);

		System.out.println("Product Details:");
		for (int i = 0; i < n; i++) {
			System.out.println("Product code: " + p[i].getProduct_code());
			System.out.println("Product Name: " + p[i].getProduct_name());
			System.out.println("Product Price: " + p[i].getPrice());
			System.out.println("Product Stock: " + p[i].getStock());
			System.out.println("Discounted Price: " + p[i].getDiscountePrice(p[i].getPrice()));
			System.out.println();
		}
		System.out.println("Product with Less Stock");
		System.out.println();
		p1 = Product.checkLesstock(p);
		System.out.println("Product code: " + p1.getProduct_code());
		System.out.println("Product Name: " + p1.getProduct_name());
		System.out.println("Product Price: " + p1.getPrice());
		System.out.println("Product Stock: " + p1.getStock());
		System.out.println("Discounted Price: " + p1.getDiscountePrice(p1.getPrice()));
	}

}
