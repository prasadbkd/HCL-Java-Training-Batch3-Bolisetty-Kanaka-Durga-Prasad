package com.hcl.example1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Employee {

	private String employeeName;
	private List<String> employeeMobile;
	private long empSalary;
	private String employeeEmail;
	@Autowired
	@Qualifier("address")
	private Address address;

	public Employee() {
	}

	public Employee(String employeeName, List<String> employeeMobile, long empSalary, String employeeEmail,
			Address address) {
		super();
		this.employeeName = employeeName;
		this.employeeMobile = employeeMobile;
		this.empSalary = empSalary;
		this.employeeEmail = employeeEmail;
		this.address = address;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<String> getEmployeeMobile() {
		return employeeMobile;
	}

	public void setEmployeeMobile(List<String> employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println(this.employeeName + "\t" + this.employeeMobile + "\t" + this.empSalary + "\t"
				+ this.employeeEmail + "\t" + this.address);
	}
}
