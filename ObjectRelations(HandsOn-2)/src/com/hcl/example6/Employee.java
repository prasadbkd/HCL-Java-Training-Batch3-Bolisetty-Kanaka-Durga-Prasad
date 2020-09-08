package com.hcl.example6;

import java.time.LocalDate;

public class Employee {

	private int employee_code;
	private String employee_name;
	private String birth_date;
	private Department dept;
	private String designation;
	private int salary;

	public Employee() {
	}

	public Employee(int employee_code, String employee_name, String birth_date, Department dept, String designation,
			int salary) {
		super();
		this.employee_code = employee_code;
		this.employee_name = employee_name;
		this.birth_date = birth_date;
		this.dept = dept;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmployee_code() {
		return employee_code;
	}

	public void setEmployee_code(int employee_code) {
		this.employee_code = employee_code;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static Employee allot_dept(Employee e, String dcode) {
		Department d = new Department();
		d.setDept_code(dcode);
		e.setDept(d);
		return e;
	}

	public static void countPeople(Employee[] e_array, String dept_code) {
		int count = 0;
		for (int i = 0; i < e_array.length; i++) {
			if (e_array[i].getDept().getDept_code().equals(dept_code)) {
				count++;
			}
		}
		System.out.println("Count of Employees in " + dept_code + " is :" + count);
	}

	public static void wishBirthday(Employee[] employeeArray) {
		LocalDate localDate = LocalDate.now();
		String locDate = localDate.toString();
		String[] locDayMonth = locDate.split("-");
		for (int i = 0; i < employeeArray.length; i++) {
			String[] bdayMonth = employeeArray[i].getBirth_date().split("-");
			if (locDayMonth[1].equals(bdayMonth[1]) && locDayMonth[2].equals(bdayMonth[2])) {
				System.out.println("Happy Birthday, " + employeeArray[i].getEmployee_name());
			}
		}
	}

	@Override
	public String toString() {
		return String.format(
				"Employee [employee_code=%s, employee_name=%s, birth_date=%s, dept=%s, designation=%s, salary=%s]",
				employee_code, employee_name, birth_date, dept.getDept_code(), designation, salary);
	}

}
