//package interfaces;



public class Robot {
	private int maxSpeed;
	
	
	public Robot(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void travel() {
		System.out.println("Robot travels at max speed: " + maxSpeed);
	}
}
