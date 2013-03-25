package edu.virginia.RobotController;

public abstract class Brick {
	
	public Brick(){
		
	}
	
	/**
	 * Allows changing the communications state of the brick.
	 * 
	 * @param state		the communications state the brick should change to
	 */
	abstract void setCommState(String state);
	
	/**
	 * View the current comm state of the brick.
	 * 
	 * @return		the current comm state
	 */
	abstract String checkComm();
	
	/**
	 * Interpret the robot's error into a string the can be sent
	 * to the control interface. 
	 * 
	 * @param error	the error the robot threw
	 * @return		the definition of the error based on the API
	 */
	abstract String interpretError(int error);
	
	/**
	 * Allows an addition of a motor to the robot.
	 * 
	 * @param m		the specific motor
	 * @param port	the specific port
	 */
	abstract void setMotor(Motor m, char port);
	
	/**
	 * Get the motor at a specific port.
	 * 
	 * @param port	the specified port
	 * @return		the motor at the specified port
	 */
	abstract Motor getMotor(char port);
	
	/**
	 * Allows an addition of a sensor to the robot.
	 * 
	 * @param s		the specific sensor
	 * @param port	the specific port
	 */
	abstract void setSensor(Sensor s, char port);
	
	/**
	 * Get the sensor at a specific port.
	 * 
	 * @param port	the specified port
	 * @return		the sensor at the specified port
	 */
	abstract Sensor getSensor(char port);
}
