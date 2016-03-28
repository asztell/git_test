package com.eintern.abstract_;



public class HoverBotTest {


	public static void main(String[] args) {

		int maxSpeed = 60;
		int altitude = 6;

		// Get and instance of HoverBot with maxSpeed and altitude already set.
		HoverBot zot = new HoverBot(maxSpeed,altitude);

		zot.hover();
		zot.sendData();

	}

}
