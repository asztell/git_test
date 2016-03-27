package demo2;



public class HoverBot extends Robot{

	private int altitude = 6;
	
	//  Method overriding
	public void travel(){
		System.out.println("Hoverbot travels at max speed of " + super.maxSpeed +" mph at an altitude of " + altitude +" ft.");
		
	}
	
}
