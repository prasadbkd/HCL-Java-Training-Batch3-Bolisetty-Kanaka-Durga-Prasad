package com.hcl.example6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static Employee[] getEmployeeData() throws NumberFormatException, IOException {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of Employees");
		n = Integer.parseInt(br.readLine());
		String[] employeeRecords = new String[n];
		Employee[] employeeArray = new Employee[n];
		for (int i = 0; i < n; i++) {
			employeeRecords[i] = br.readLine();
		}
		for (int i = 0; i < n; i++) {
			String[] ea = employeeRecords[i].split(",");
			Employee e = new Employee();
			e.setEmployee_code(Integer.parseInt(ea[0]));
			e.setEmployee_name(ea[1]);
			e.setBirth_date(ea[2]);
			e.setDept(Employee.allot_dept(e, ea[3]).getDept());
			e.setDesignation(ea[4]);
			e.setSalary(Integer.parseInt(ea[5]));
			employeeArray[i] = e;
		}
		return employeeArray;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee[] employeeArray = Main.getEmployeeData();
		System.out.println("Enter dept code to count the number of Employees working in that department");
		String dept_code = br.readLine();
		Employee.countPeople(employeeArray, dept_code);

	}

}
