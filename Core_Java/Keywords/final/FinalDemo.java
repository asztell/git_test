package com.eintern.final_;



public class FinalDemo {
	// Initialize while declaring, later value cannot be changed
	public static final int NUMBER = 10;   // final static variable

	
	public static void print() {
		// Printing final static variable
		System.out.println("Number: " + NUMBER);
	}

	public static void main(String[] args) {
		// Calling print() with class reference
		FinalDemo.print(); 
	}
	
}
