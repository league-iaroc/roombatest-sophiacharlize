package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {

	}

	public void loop() {
		driveDirect(200,200);
if(isBumpedRight()) {
	driveDirect(-200,-200);
	sleep(1000);
	driveDirect(200,400);
	sleep(1000);
	driveDirect(200,200);
	sleep(18000);
	driveDirect(-200,-200);
	sleep(1000);
	//try to get the robot to hug the sides of the maze 
	
}
	}
}
