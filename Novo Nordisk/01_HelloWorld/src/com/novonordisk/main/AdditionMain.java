package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.Addition;

public class AdditionMain {
public static void main(String[] args) {
	System.out.println("AdditionMain Start");
	 //Declaration
	
	int n1;
	int n2;
	
	//Initialization 
	
	
	
	//Accept Values from User 
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Value for n1");
	n1 = scanner.nextInt();
	System.out.println("Enter Value for n2");
	n2 = scanner.nextInt();
	
	
	
	
	
	
	
	//create object of Addition Class and call accept function from DOmain
	
	Addition addObject = new Addition();
	addObject.accept(n1, n2);
	
	System.out.println("AdditionMain end");
}
	
}

