package com.eintern.classes.demo1;



public class Robot {
	// Declaring fields, generally they are private
	// Only visible within the class 
	private int maxSpeed;

	// Public methods can be accessed outside the class
	// A setter method to set the value for maxSpeed field
	public void setMaxSpeed (int speed) {
		maxSpeed = speed; 
	}

	// Method travel to print the maxSpeed of this Robot
	public void travel() {
		System.out.println("Robot travels at max speed: " + maxSpeed);
	}

}
