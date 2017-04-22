package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	driveDirect(200,200);
	sleep(5000);
	driveDirect(200,400);
	sleep(1280);
	driveDirect(200,200);
	sleep(4000);
	driveDirect(400,200);
	sleep(1280);
	driveDirect(200,200);
	sleep(4000);
	driveDirect(200,400);
	sleep(1280);
	driveDirect(200,200);
	sleep(3000);
	driveDirect(400,200);
	sleep(1280);
	driveDirect(200,200);
	
	
	}

	public void loop() {
	
	}
}
