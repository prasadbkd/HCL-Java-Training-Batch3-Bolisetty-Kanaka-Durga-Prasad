package com.hcl.example4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
public class Course {

	private String name;
	private String mentor;
	private double fee;

	public Course() {
	}

	public Course(String name, String mentor, double fee) {
		super();
		this.name = name;
		this.mentor = mentor;
		this.fee = fee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void setDetails(String name,String mentor,double fee) {
		this.setName(name);
		this.setMentor(mentor);
		this.setFee(fee);
		
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", mentor=" + mentor + ", fee=" + fee + "]";
	}

	public void display() {
		System.out.println(this.name+"\t"+this.mentor+"\t"+this.fee);
	}
}
