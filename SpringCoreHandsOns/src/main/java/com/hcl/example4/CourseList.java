package com.hcl.example4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class CourseList {

	private List<Course> courseList = new ArrayList<Course>();

	public CourseList() {
	}

	public CourseList(List<Course> courseList) {

		this.courseList = courseList;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public void insert(Course course) {
		//System.out.println(course);
		this.courseList.add(course);
	}

	public void revenue() {
		double revenue = 0;
		double tot =0;
		//System.out.println(this.courseList);
		for(Course c : this.courseList) {
			System.out.println(c);
			tot= 0.2 * c.getFee()*200;
			revenue=revenue+tot;
		}
		System.out.println("Revenue is "+revenue );
	}}
