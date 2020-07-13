package fr.alteca.robot;

import robocode.Robot;
import robocode.ScannedRobotEvent;


public class RobotSeb extends Robot {
	
	@Override
	public void run() {
		turnLeft(getHeading() % 90);
		turnGunRight(90);
		while(true) {
			ahead(1000);
			turnRight(90);
		}
	}
	
	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		fire(1);
	}

}
