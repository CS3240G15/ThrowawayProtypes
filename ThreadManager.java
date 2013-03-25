package edu.virginia.RobotController;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.navigation.DifferentialPilot;

public class ThreadManager {

	DifferentialPilot pilot;

	public void go() {
		pilot.travel(20, true);
		pilot.rotateLeft();
		pilot.rotateRight();
		pilot.travel(20, true);
		while (pilot.isMoving()) {
			if (Button.waitForAnyPress() !=0 )
				pilot.stop();
		}
		System.out.println(" " + pilot.getMovement().getDistanceTraveled());
		Button.waitForAnyPress();
	}

	public static void main(String[] args) {
		ThreadManager t = new ThreadManager();
		t.pilot = new DifferentialPilot(2.25f, 5.5f, Motor.A, Motor.C);
		t.go();
		// Instantiate program thread
		// Instantiate communicator thread
		// Set comm state of robot to read
		// Set up motor, sensors
		// Set communicator thread to read
		// while (read){ perform action }
		// When reading, send back ack to inform sender of safe delivery of message
		// 
		
	}

}
