package com.hcl.example8;

public class Actor {

	private int id;
	private String name;
	private String contact_num;

	public Actor() {
	}

	public Actor(int id, String name, String contact_num) {
		super();
		this.id = id;
		this.name = name;
		this.contact_num = contact_num;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact_num() {
		return contact_num;
	}

	public void setContact_num(String contact_num) {
		this.contact_num = contact_num;
	}

}
