package com.novonordisk.domain;

public class EmployeeClass {
private int employeeId;
private String name;
private double salary;

public EmployeeClass() {
	// TODO Auto-generated constructor stub
}

public EmployeeClass(int employeeId, String name, double salary) {
	super();
	this.employeeId = employeeId;
	this.name = name;
	this.salary = salary;
}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}



}