package com.novonordisk.main;

import com.novonordisk.domain.Circle;

public class CircleMain {
public static void main(String[] args) {
	System.out.println("CircelMain Start");
	 //Declaration
	
	int r;
	
	
	//Initialization 
	
	r = 10;
	
	Circle addObject = new Circle();
	addObject.area(r);
	System.out.println("CircleMain end");

}
}
