package com.hcl.example6;

public class Department {
	private String dept_code;
	private String dept_name;

	Department() {
	}

	public Department(String dept_code, String dept_name) {
		super();
		this.dept_code = dept_code;
		this.dept_name = dept_name;
	}

	public String getDept_code() {
		return dept_code;
	}

	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

}
