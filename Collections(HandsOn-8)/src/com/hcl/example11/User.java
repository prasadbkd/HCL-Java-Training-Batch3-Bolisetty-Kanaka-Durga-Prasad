package com.hcl.example11;

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

	public void sortName(List<User> ul) {
		Collections.sort(ul, (p, q) -> {
			return p.getName().compareTo(q.getName());

		});

	}

	public void sortEmail(List<User> ul) {
		ul.sort((p, q) -> p.getEmail().compareTo(q.getEmail()));
		// Collections.sort(ul, (p, q) -> {
		// return p.getEmail().compareTo(q.getEmail());

		// });
	}

	public void display(List<User> ul) {
		for (User u : ul) {
			System.out.println(u);
		}
	}
}
