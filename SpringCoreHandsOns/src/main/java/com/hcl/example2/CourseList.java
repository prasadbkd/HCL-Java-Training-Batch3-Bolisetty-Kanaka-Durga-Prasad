package com.hcl.example2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CourseList {

	private List<Course> courseList = new ArrayList<Course>();
	public CourseList() {}
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
	
	public ArrayList<String> noOfCourse(double budget){
		ArrayList<String> noOfC = new ArrayList<>();
		
		for(Course c: this.courseList) {
			if(c.getFee()==budget) {
				String message=c.getName()+"-1";
				noOfC.add(message);
			}else if(c.getFee()<budget){
				double fee = c.getFee();
				double budgt = budget;
				int no = (int) (budgt/fee);
				String message=c.getName()+"-"+no;
				noOfC.add(message);
			}
		}
		
		
		return noOfC; 
	}
}
