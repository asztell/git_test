package com.eintern.abstract_;




public abstract class Robot {
	private int maxSpeed;
	
	
	public Robot(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	// Concrete method
	public void travel() {
		System.out.println("Robot travels at max speed: " + maxSpeed);
	}

	// Every robot can send data but they need not send the same data.
	// Robot being super class does not know what data will be sent!
	// To make sure all subclasses implement sendData method this
	// method is declared abstract.
	public abstract void sendData();
	
	
}
