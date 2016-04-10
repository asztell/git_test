



public class HoverBotPolyTest {


	public static void main(String[] args) {

		// Instantiating HoverBot class
		HoverBot zot = new HoverBot(20, 10);
		zot.hover();

		// Super class can refer to subclass object
		Robot robot = zot;

		// Calling travel() with super class reference 
		robot.travel();

		// Super interface can also refer to subclass object
		Protector protector = zot;

		// Calling defend() with Protector interface reference
		protector.defend();
	}
}
