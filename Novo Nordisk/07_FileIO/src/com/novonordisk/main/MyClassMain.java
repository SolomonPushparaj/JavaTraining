package com.novonordisk.main;

import com.novonordisk.domain.MyClass;

public class MyClassMain {
	public static void main(String[] args) {

		MyClass myclass = new MyClass();
		//System.out.println(myclass.getData());

		int[] numbers = new int[3];
		numbers[0] = 23;
		numbers[1] = 22;
		numbers[2] = 21;
		
		myclass.setData(numbers);
		//System.out.println(myclass.getData());
		
		for (int i : numbers) {
			System.out.println(i);
		}
		
		System.out.println("----------------");
		System.out.println("Values from Class");
		for (int i : myclass.getData()) {
			System.out.println(i);
		}
		
		System.out.println("----------------");
		System.out.println("Change in Array Main");
		numbers[1]=100;
		System.out.println("----------------");
		System.out.println("Values from Class");
		for (int i : myclass.getData()) {
			System.out.println(i);
		
	}
		System.out.println("Values from Main");
		for (int i : numbers) {
			System.out.println(i);
		}
		
}
}