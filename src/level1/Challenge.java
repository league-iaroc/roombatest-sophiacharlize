package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		driveDirect(100,100);
		sleep(6000);
		driveDirect(100,200);
		sleep(3500);
		driveDirect(200,200);
		sleep(14000);
		driveDirect(100,200);
		sleep(3000);
		driveDirect(100,100);
		
		
	}

	public void loop() {
	
	}
}
