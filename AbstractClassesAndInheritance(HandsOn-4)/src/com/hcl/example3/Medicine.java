package com.hcl.example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public abstract class Medicine {

	protected String name;
	protected double price;
	protected String expiryDate;

	public Medicine() {
	}

	public Medicine(String name, double price, String expiryDate) {
		super();
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public static Medicine[] getDetails() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rand = new Random();
		System.out.println("Enter the number of medicines");
		int n = Integer.parseInt(br.readLine());

		Medicine[] Medarray = new Medicine[n];
		for (int i = 0; i < n; i++) {
			int randomNum = rand.nextInt((3 - 1) + 1) + 1;
			System.out.println("Enter" + randomNum + ". Medicine Details :(name,price,exp date)");
			if (randomNum == 1) {
				System.out.println("Enter ointment details: ");
				String med = br.readLine();
				String[] detailArray = med.split(",");
				Medicine m = new Ointment(detailArray[0], Double.parseDouble(detailArray[1]), detailArray[2]);
				Medarray[i] = m;
			} else if (randomNum == 2) {
				System.out.println("Enter Tablet details: ");
				String med = br.readLine();
				String[] detailArray = med.split(",");
				Medicine m = new Tablet(detailArray[0], Double.parseDouble(detailArray[1]), detailArray[2]);
				Medarray[i] = m;

			} else if (randomNum == 3) {
				System.out.println("Enter syrup details: ");
				String med = br.readLine();
				String[] detailArray = med.split(",");
				Medicine m = new Syrup(detailArray[0], Double.parseDouble(detailArray[1]), detailArray[2]);
				Medarray[i] = m;
			}
		}
		return Medarray;
	}

	abstract public void getLable();

	@Override
	public String toString() {
		return String.format("\nMedicine Details: \nName = %s \nPrice = %s \nExpiry = %s", name, price, expiryDate);
	}

}
