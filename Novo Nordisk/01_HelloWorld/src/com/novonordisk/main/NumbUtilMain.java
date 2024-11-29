package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.NumberUtil;

public class NumbUtilMain {
public static void main(String[] args) {
	//int number;
	int n1;
	int n2;
	int n3;
	//System.out.println("Enter the Number");
	Scanner scanner= new Scanner(System.in);
	//number = scanner.nextInt();
	
	//NumberUtil numberutil = new NumberUtil();
	//int output= numberutil.getSquareOfNumber(number);
	//System.out.println("Result is " +  output);
	
	
	System.out.println("Enter n1");
	n1=scanner.nextInt();
	System.out.println("Enter n2");
	n2=scanner.nextInt();
	System.out.println("Enter n3");
	n3=scanner.nextInt();
	
	NumberUtil numberUtil = new NumberUtil();
	int result = numberUtil.getLargest(n1, n2, n3);
	System.out.println(result);
	
}


	
	
	
}
 
