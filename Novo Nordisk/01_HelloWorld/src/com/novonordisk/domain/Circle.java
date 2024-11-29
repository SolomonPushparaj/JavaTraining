package com.novonordisk.domain;

public class Circle {
	public void area(int r) {

		System.out.println("In Circle Class");
		System.out.println("area() called");
		System.out.println(r);
		double result = 3.14 * r * r;
		System.out.println("Area is" + result);
	}
}
