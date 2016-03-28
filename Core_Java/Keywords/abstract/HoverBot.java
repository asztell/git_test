package com.eintern.abstract_;



public class HoverBot extends Robot {
	private int altitude;


	// Constructor to initialize maxspeed and altitude of HoverBot
	public HoverBot(int maxSpeed, int altitude) {
		super(maxSpeed); 
		this.altitude = altitude;
	}

	public void hover() {
		System.out.println("HoverBot floating at an altitude of " + altitude +" ft");
	}

	// HoverBot overrides sendData to avoid becoming an abstract class.
	public void sendData() {
		// HoverBot specific implementation of sendData method
		System.out.println("Sending location information...");
	}

}
