package com.hcl.example3;

import com.hcl.example3.Car;

public class Service implements Car {

	@Override
	public int sum (int num) {
		int sum1=0;
		int temp = num;
		while(temp!=0) {
			int r = temp%10;
			sum1 = sum1+ r;
			temp=temp/10;
		}
		return sum1;
	}

	@Override
	public int years(int years) {
		return years;
	}

	@Override
	public String brand(String brand) {
		return brand;
	}

}
