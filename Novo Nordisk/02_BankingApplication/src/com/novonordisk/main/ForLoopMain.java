package com.novonordisk.main;

public class ForLoopMain {
	public static void main(String[] args) {
//	for (int i=0; i<10; i++) {
//		System.out.println(i);
//	}
		
		//Get all odd numbers from 1- 100 
		
		for (int i = 0; i < 101; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}
	}
}
