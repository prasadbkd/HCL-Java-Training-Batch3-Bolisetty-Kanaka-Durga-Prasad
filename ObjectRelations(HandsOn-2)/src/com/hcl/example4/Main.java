package com.hcl.example4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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
		int choice = 0;
		List<Product> productList = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("Menu");
			System.out.println(
					"1.Add \n2.Display \n3.Check Min stock \n4.Get Discounted Prices \n5.Find Costly Product \n6.Exit");
			System.out.println("Enter the choice: ");
			choice = Integer.parseInt(br.readLine());
			if (choice == 1) {
				Product p = Main.buildPRoduct();
				productList.add(p);

			} else if (choice == 2) {
				Product.display(productList);
			} else if (choice == 3) {
				Product.checkLesstock(productList);
			} else if (choice == 4) {
				Product.getDiscountedPrice(productList);
			} else if (choice == 5) {
				Product.checkHighPriceProduct(productList);
			} else if (choice == 6) {
				System.out.println("Thank you");
				break;
			} else {
				System.out.println("Enter valid choice");
			}
		}

	}

}
