package com.hcl.example5;

import org.springframework.stereotype.Component;

@Component
public class Owner {

	private String name;
	private String password;
	private String phoneNumber;

	public Owner() {
	}

	public Owner(String name, String password, String phoneNumber) {
		super();
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setDetails(String name, String password, String mobileNumber) {
		this.setName(name);
		this.setPassword(password);
		this.setPhoneNumber(mobileNumber);
	}

	public void display() {
		System.out.println(this.name + "\t" + this.password + "\t" + this.phoneNumber);
	}
}
