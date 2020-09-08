package com.hcl.example5;

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
			employeeArray[i] = new Employee(Integer.parseInt(ea[0]), ea[1], ea[2], ea[3], ea[4],
					Integer.parseInt(ea[5]));
		}
		return employeeArray;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Employee[] employeeArray = Main.getEmployeeData();
		Employee.wishBirthday(employeeArray);
	}

}
