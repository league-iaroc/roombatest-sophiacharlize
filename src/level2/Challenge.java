package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
driveDirect(200,200);
sleep(6500);
driveDirect(200,400);
sleep(1380);
driveDirect(200,200);
sleep(10000);
driveDirect(400,200);
sleep(1350);
driveDirect(200,200);

	}

	public void loop() {
	
	}
}
