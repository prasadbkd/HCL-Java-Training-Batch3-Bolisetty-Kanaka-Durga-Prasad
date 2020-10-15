package com.hcl.example7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@SuppressWarnings("deprecation")
@Component
public class Box {

	private User user;
	private int length;
	private int breadth;

	public Box() {
	}

	public Box(User user, int length, int breadth) {
		super();
		this.user = user;
		this.length = length;
		this.breadth = breadth;
	}

	public User getUser() {
		return user;
	}

	@Required
	@Autowired
	public void setUser(User user) {
		this.user = user;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Box [user=" + user + ", length=" + length + ", breadth=" + breadth + "]";
	}
	public void display() {
		System.out.println("The box of lenght "+this.length+" and width "+this.breadth+" is owned  by "+this.user.getName());
	}
	
	

}
