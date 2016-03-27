package com.eintern.classes.demo2;



public class Robot {
	// Declaring fields, generally they are private
	// Only visible within the class 
	private int maxSpeed;

	// "No arg" constructor
	public Robot() {
	}

	// Overloaded constructor to initialize maxSpeed field
	public Robot(int maxSpeed) {
		// This keyword refers to the Robot field “maxSpeed”
		this.maxSpeed = maxSpeed; 
	}

	// Being public method, this can be accessed outside the class
	public void travel() {
		System.out.println("Robot travels at max speed: " + maxSpeed);
	}

}
