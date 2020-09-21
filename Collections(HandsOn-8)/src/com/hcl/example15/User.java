package com.hcl.example15;

import java.util.Collections;
import java.util.List;

public class User {

	private String name;
	private String email;
	private String username;
	private String password;

	public User() {
	}

	public User(String name, String email, String username, String password) {
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("User name: %s, email: %s, username: %s, password: %s", name, email, username, password);
	}

	
	public User searchUserbyName(List<User> ul,String name) {
		User user = null;
		for(User u : ul) {
			if(u.getName().equals(name))
				user= u;
		}
		return user;
		
		
	}
	public User searchUserbyEmail(List<User> ul,String email) {
		User user = null;
		for(User u : ul) {
			if(u.getEmail().equals(email))
				user= u;
		}
		return user;
		
		
	}


	public void display(List<User> ul) {
		System.out.printf("\n%-15s%-15s", "Name", "Email");
		for (User u : ul) {
			System.out.printf("\n%-15s%-15s", u.getName(), u.getEmail());
		}
	}
}
