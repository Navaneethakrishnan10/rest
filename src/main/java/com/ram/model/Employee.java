package com.ram.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empId;
	private String empName;
	private String emailId;
	private long salary;

	public Employee(int empId, String empName, String emailId, long salary) {
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
		this.salary = salary;
	}

	public int getempId() {
		return this.empId;
	}

	public void setempId(int empId) {
		this.empId = empId;
	}

	public String getempName() {
		return this.empName;
	}

	public void setempName(String empName) {
		this.empName = empName;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getsalary() {
		return this.salary;
	}

	public void setsalary(long salary) {
		this.salary = salary;
	}

	public Employee() {
	}
}
