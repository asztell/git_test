//package interfaces;



public class HoverBot extends Robot implements Protector {

	private int altitude;

	// Constructor to initialize maxSpeed and altitude of HoverBot
	public HoverBot(int maxSpeed, int altitude) {
		super(maxSpeed); 
		this.altitude = altitude;
	}

	public void hover() {
		System.out.println("HoverBot floating at an altitude of " + altitude +" ft");
	}

	// Hoverbot’s override defend() to avoid becoming an abstract class.
	public void defend() {
		// Hoverbot specific implementation of defend method from Protector
		System.out.println("Defending against attacks!");
	}
}
