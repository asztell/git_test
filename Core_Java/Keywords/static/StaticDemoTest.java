package com.eintern.static_;



public class StaticDemoTest {

	
	// main method is always static so JVM can call it   
	// without creating object of this class 
	public static void main(String[] args) {
		StaticDemo demo1 = new StaticDemo();
		StaticDemo demo2 = new StaticDemo();

		demo1.print();
		demo2.print();
		
		// Printing static variable counter with class ref
		System.out.println("Counter: " + StaticDemo.counter);
	}
}
