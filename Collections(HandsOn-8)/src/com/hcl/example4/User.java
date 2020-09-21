package com.hcl.example4;

import java.util.List;

public class User {

	private String uname;
	private String contactNumber;
	private String email;

	public User() {
	}

	public User(String uname, String contactNumber, String email) {
		super();
		this.uname = uname;
		this.contactNumber = contactNumber;
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("User [uname=%s, contactNumber=%s, email=%s]", uname, contactNumber, email);
	}
	
	
		
	}


