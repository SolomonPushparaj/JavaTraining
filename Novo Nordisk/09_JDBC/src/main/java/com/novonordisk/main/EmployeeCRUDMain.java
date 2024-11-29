package com.novonordisk.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.novonordisk.domain.EmployeeCRUD;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		
		EmployeeCRUD employeeCRUD = new EmployeeCRUD();
		int employeeId;
		String name;
		double salary;
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		employeeCRUD.getAllEmployess();
		
		System.out.println("----------------------");
		
		
		
		System.out.println("Enter the Employee ID");
        employeeId = scanner.nextInt();
        
        employeeCRUD.deleteEmployee(employeeId);;
        
        System.out.println("----------------------");
        
        employeeCRUD.getAllEmployess();
        
        
        
		//update code 
//		System.out.println("Enter the Employee ID for whom the data to be changed");
//		employeeId = scanner.nextInt();
//		
//		System.out.println("Enter New Employee name");
//		name = scanner.next();
//		
//		System.out.println("Enter New Employee Salary");
//		salary = scanner.nextDouble();
//		
//		employeeCRUD.updateEmployee(employeeId, name, salary);
		
		System.out.println("-------------------------------");
		
		employeeCRUD.getAllEmployess();
}
}