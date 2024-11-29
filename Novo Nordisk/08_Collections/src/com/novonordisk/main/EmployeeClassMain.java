package com.novonordisk.main;

import java.util.HashSet;

import com.novonordisk.domain.EmployeeClass;

public class EmployeeClassMain {
public static void main(String[] args) {
	
	EmployeeClass employee1= new EmployeeClass(101, "Employee 1", 10000);
	EmployeeClass employee2= new EmployeeClass(101, "Employee 2", 10000);
	EmployeeClass employee3= new EmployeeClass(101, "Employee 3", 10000);
	
	HashSet<EmployeeClass> employeeSet = new HashSet<EmployeeClass>();
	
	System.out.println(employeeSet);
	 employeeSet.add(employee1);
	 employeeSet.add(employee2);
	 employeeSet.add(employee3);
	 
	 System.out.println(employeeSet);
	 
	 for(EmployeeClass i : employeeSet ) {
		 
		 System.out.println(i.getEmployeeId() + "" + i.getName() + "" + i.getSalary() );
	 }
	 
	 
}
}
