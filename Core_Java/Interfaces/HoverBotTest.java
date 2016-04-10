

public class HoverBotTest {

	
	public static void main(String[] args) {

		// Instantiating HoverBot class
		HoverBot zot = new HoverBot(20, 10);

		// Calling methods on the HoverBot object
		zot.travel();
		zot.hover();

		// Calling Protector method
		zot.defend();
	}
}
