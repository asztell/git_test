package com.eintern.demo3;




	// extends keyword to specify Parent/Super class
	public class HoverBot extends Robot {
	   private int altitude;

	   // Default constructor
	   public HoverBot() {
	   }
	   
	   // Constructor to initialize maxSpeed and altitude of HoverBot
	   public HoverBot(int maxSpeed, int altitude) {
		// Calling constructor of super class to initialize maxSpeed
		super(maxSpeed); 
		this.altitude = altitude;
	   }

	   // HoverBot has hover behavior to expose
	   public void hover() {
		System.out.println("HoverBot hovering at altitude: " + altitude);
	   }
	}
