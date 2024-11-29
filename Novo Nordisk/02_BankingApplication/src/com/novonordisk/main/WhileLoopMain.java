package com.novonordisk.main;

import java.util.Scanner;

public class WhileLoopMain {
	public static void main(String[] args) {

		int inputValue;
		int result;
		
		
//		int i = 11;
//
//		while (i < 10) {
//			System.out.println(i);
//			i = i + 1;
//		}
//		System.out.println("Outside Loop");
		
		//Accept Number from User
		//Print multiplication Table
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Enter the Input Value Number from 1-10");
		inputValue=scanner.nextInt();
		
		while(inputValue<10) {
			System.out.println(inputValue);
			result= inputValue*8;
			inputValue=inputValue+1;
			System.out.println("Output is " + result);
		}
		
	}
}
