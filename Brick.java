
public interface Brick {
	
	/**
	 * Allows changing the communications state of the brick.
	 * 
	 * @param state		the communications state the brick should change to
	 */
	void setCommState(String state);
	
	/**
	 * View the current comm state of the brick.
	 * 
	 * @return		the current comm state
	 */
	String checkComm();
	
	/**
	 * Interpret the robot's error into a string the can be sent
	 * to the control interface. 
	 * 
	 * @param error	the error the robot threw
	 * @return		the definition of the error based on the API
	 */
	String interpretError(int error);
	
	/**
	 * Allows an addition of a motor to the robot.
	 * 
	 * @param m		the specific motor
	 * @param port	the specific port
	 */
	void setMotor(Motor m, char port);
	
	/**
	 * Get the motor at a specific port.
	 * 
	 * @param port	the specified port
	 * @return		the motor at the specified port
	 */
	Motor getMotor(char port);
	
	/**
	 * Allows an addition of a sensor to the robot.
	 * 
	 * @param s		the specific sensor
	 * @param port	the specific port
	 */
	void setSensor(Sensor s, char port);
	
	/**
	 * Get the sensor at a specific port.
	 * 
	 * @param port	the specified port
	 * @return		the sensor at the specified port
	 */
	Sensor getSensor(char port);
}
