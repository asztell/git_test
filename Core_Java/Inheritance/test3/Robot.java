package com.eintern.demo3;



	public class Robot {
		private int maxSpeed;

		// Default & Parameterized constructors
		public Robot() {
		}

		public Robot(int maxSpeed) {
			this.maxSpeed = maxSpeed; 
		}

		public void travel() {
			System.out.println("Robot travels at max speed: " + maxSpeed);
		}
	}

