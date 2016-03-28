package com.eintern.static_;



public class StaticDemo {
	private int number;			// instance variable
	public static int counter; 	// static variable

	// constructor
	public StaticDemo() {
		number ++;	// incrementing instance variable
		counter ++;	// incrementing static variable
	}


	public void print() {
		System.out.println("Number: " + number);
		System.out.println("Counter: " + counter);
	}
	
}
