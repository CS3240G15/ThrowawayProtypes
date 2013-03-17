
public interface Motor {
	
	/**
	 * Moves the motor in the forward direction.
	 * 
	 * @param speed	the speed the motor should run at
	 */
	void forward(int speed);
	
	/**
	 * Moves the motor in the backward direction.
	 * 
	 * @param speed	the speed the motor should run at
	 */
	void reverse(int speed);
	
	/**
	 * Stops the motor.
	 */
	void stop();
	
	/**
	 * Gets the port of the motor.
	 * 
	 * @return	the port of the motor
	 */
	char getPort();
	
	/**
	 * Sets the port of the motor.
	 * 
	 * @param p	the port specified for the motor
	 */
	void setPort(char p);
	
	/**
	 * Gets the name of the motor.
	 * 
	 * @return	the name of the motor
	 */
	String getName();
	
	/**
	 * Sets the name of the motor.
	 * 
	 * @param n	name of the motor
	 */
	void setName(String n);
	
	/**
	 * Gets the speed of the motor at the current time.
	 * 
	 * @return	speed of motor (absolute value)
	 */
	int getSpeed();
	
	/**
	 * Gets the direction of the motor at the current time.
	 * 
	 * @return	direction of the motor
	 */
	int getDirection();
	
	
}
