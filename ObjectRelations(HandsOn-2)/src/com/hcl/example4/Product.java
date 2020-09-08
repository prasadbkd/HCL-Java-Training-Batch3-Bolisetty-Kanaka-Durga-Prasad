package com.hcl.example4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product {
	private int product_code;
	private String product_name;
	private double price;
	private int stock;
	private static final String name = "L & K Suppliers";

	public Product() {
	}

	public Product(int product_code, String product_name, double price, int stock) {
		super();
		this.product_code = product_code;
		this.product_name = product_name;
		this.price = price;
		this.stock = stock;
	}

	public static String getName() {
		return name;
	}

	public int getProduct_code() {
		return product_code;
	}

	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public static String checkPrice(Product p, Product q) {
		String s = new String();
		if (p.getPrice() > q.getPrice())
			s = q.product_name + " is cheaper than " + p.product_name;
		else
			s = p.product_name + " is cheaper than " + q.product_name;

		return s;

	}

	public double getDiscountePrice(double price) {
		double discountedPrice = 0.0;
		if (price >= 80000.0) {
			discountedPrice = (30.0 / 100.0) * price;
			return discountedPrice;
		} else if (price >= 60000.0) {
			discountedPrice = (20.0 / 100.0) * price;
			return discountedPrice;
		} else if (price >= 50000.0) {
			discountedPrice = (10.0 / 100.0) * price;
			return discountedPrice;
		} else {
			discountedPrice = (50.0 / 100.0) * price;
			return discountedPrice;
		}
	}

	public static void checkLesstock(List<Product> productList) {
		List<Integer> il = new ArrayList<>();
		int size = productList.size();
		// int[] stockArray = new int[size];
		Product[] productArray = productList.toArray(new Product[productList.size()]);
		for (int i = 0; i < size; i++) {
			il.add(productArray[i].getStock());
		}
		int x = il.indexOf(Collections.min(il));
		Product minStockProduct = productArray[x];
		System.out.println("The Product with Min Stock is :");
		System.out.println("Product Name: " + minStockProduct.getProduct_name());
		System.out.println("Product Stock: " + minStockProduct.getStock());

	}

	public static void checkHighPriceProduct(List<Product> productList) {
		List<Double> il = new ArrayList<>();
		int size = productList.size();
		// double[] stockArray = new double[size];
		Product[] productArray = productList.toArray(new Product[productList.size()]);
		for (int i = 0; i < size; i++) {
			// stockArray[i] = productArray[i].getPrice();
			il.add(productArray[i].getPrice());
		}
		int x = il.indexOf(Collections.max(il));
		Product minStockProduct = productArray[x];
		System.out.println();
		System.out.println("The Product with Max Price is :");
		System.out.println("Product Name: " + minStockProduct.getProduct_name());
		System.out.println("Product Price: " + minStockProduct.getPrice());

	}

	public static void display(List<Product> productList) {
		System.out.println("Product Details:");
		for (Product i : productList) {
			System.out.println();
			System.out.println(Product.getName());
			System.out.println("Product code: " + i.getProduct_code());
			System.out.println("Product Name: " + i.getProduct_name());
			System.out.println("Product Price: " + i.getPrice());
			System.out.println("Product Stock: " + i.getStock());
		}
	}

	public static void getDiscountedPrice(List<Product> productList) {
		System.out.println("The discounted prices are:");
		for (Product i : productList) {
			System.out.println();
			System.out.println("Product Name: " + i.getProduct_name() + "\nDiscounted Price: "
					+ i.getDiscountePrice(i.getPrice()));
		}
	}

	@Override
	public String toString() {
		return String.format("Product [product_code=%s, product_name=%s, price=%s, stock=%s]", product_code,
				product_name, price, stock);
	}

}
