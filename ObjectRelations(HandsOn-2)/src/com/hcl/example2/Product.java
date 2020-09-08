package com.hcl.example2;

public class Product {
	private int product_code;
	private String product_name;
	private double price;
	private int stock;
	private static final String name="L & K Suppliers";
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

	@Override
	public String toString() {
		return String.format("Product [product_code=%s, product_name=%s, price=%s, stock=%s]", product_code,
				product_name, price, stock);
	}
	
}
