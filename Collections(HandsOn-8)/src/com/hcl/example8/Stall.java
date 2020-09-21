package com.hcl.example8;

import java.util.Iterator;
import java.util.List;

public class Stall {

	private String name;
	private String detail;
	private String type;
	private String ownerName;

	public Stall() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Stall(String name, String detail, String type, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return String.format("Stall [name=%s, detail=%s, type=%s, ownerName=%s]", name, detail, type, ownerName);
	}

	void removeTest(List<Stall> s) {
           Iterator<Stall> i =s.iterator();
           while(i.hasNext()) {
        	   if(i.next().getName().startsWith("test"))
        		   i.remove();
			}
		}
	
	
	public void display(List<Stall> s) {
		for(Stall ss : s) {
			System.out.printf("%-15s%-15s%-15s%-15s",ss.name,ss.getOwnerName(),ss.getType(),ss.getDetail());
		}
	}

}
