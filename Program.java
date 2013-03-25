package edu.virginia.RobotController;

public interface Program {

	/**
	 * Sends a message to the control station.
	 * 
	 * @param message	the message to send
	 */
	void send(String message);
	
	/**
	 * Receives a message from the control station.
	 * 
	 * @return	the message from the control station	
	 */
	String receive();
	
	/**
	 * This will stop the brick at any point in time.
	 */
	void emergencyStop();
	
	/**
	 * This function will "repaint" or update the screen
	 * with the newest information.
	 */
	void updateGUI();
	
	/**
	 * Moves a specified motor with a specific speed.
	 * 
	 * @param m		the specified motor
	 * @param speed	the speed of the motor
	 */
	void moveMotor(Motor m, int speed);
	
	/**
	 * Stops a specific motor.
	 * 
	 * @param m	the motor to be stopped
	 */
	void stop(Motor m);
	
	/**
	 * Takes a reading from the specified sensor.
	 * 
	 * @param s	the specified sensor to take a reading from
	 * @return	the value of the sensor at the current point in time	
	 */
	int takeReading(Sensor s);
	
	/**
	 * Aborts the currently running task on the robot.
	 */
	void abort();
	
}
