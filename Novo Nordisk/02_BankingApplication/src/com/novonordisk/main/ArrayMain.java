package com.novonordisk.main;

public class ArrayMain {
 public static void main(String[] args) {
	int [] numbers= new int[5];
	
	numbers [0]=99;
	numbers [1]=19;
	numbers [2]=59;
	numbers [3]=89;
	numbers [4]=69;
	
	System.out.println(numbers[0]);
	System.out.println(numbers[1]);
	System.out.println(numbers[2]);
	System.out.println(numbers[3]);
	System.out.println(numbers[4]);
	
	System.out.println("----------------------------");
	
	
	
	for (int i=0; i <numbers.length; i++ ) {
		
		System.out.println(numbers[i]);
	}
	
}
}
