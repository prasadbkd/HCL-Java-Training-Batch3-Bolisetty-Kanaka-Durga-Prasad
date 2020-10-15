package com.hcl.example3;

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
		System.out.println(course);
		this.courseList.add(course);
	}

	public ArrayList<String> noOfCourse(double budget) {
		ArrayList<String> noOfC = new ArrayList<>();

		for (Course c : this.courseList) {
			if (c.getFee() == budget) {
				String message = c.getName() + "-1";
				noOfC.add(message);
			} else if (c.getFee() < budget) {
				double fee = c.getFee();
				double budgt = budget;
				int no = (int) (budgt / fee);
				String message = c.getName() + "-" + no;
				noOfC.add(message);
			}
		}

		return noOfC;
	}

	public void discount() {
		courseList.sort((p, q) -> (int) (p.getFee() - q.getFee()));
		Course minPrice = courseList.get(0);
		Course maxPrice = courseList.get(courseList.size() - 1);
		double dmin =0.05 * minPrice.getFee();
		double dmax =  0.1 * maxPrice.getFee();
		System.out.println(minPrice.getName() + " discounted price is " + dmin);
		System.out.println(maxPrice.getName() + " discounted price is " + dmax);

	}
}
