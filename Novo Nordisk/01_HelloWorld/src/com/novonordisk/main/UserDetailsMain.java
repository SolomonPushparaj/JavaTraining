package com.novonordisk.main;

import java.util.Scanner;

public class UserDetailsMain {
public static void main(String[] args) {
	System.out.println("Enter Your Name");
	String name;
	int age;
	
	//Create Scanner Class Object
	
	Scanner scanner = new Scanner(System.in);
	
	//Accept Values from User
	
	name = scanner.nextLine();
	System.out.println("Name =" + name);
	
	System.out.println("Enter Your Age");
	age = scanner.nextInt();
	System.out.println("Age  =" + age);
	
	
	
		
	
	
	
}

}
