
public interface Sensor {
	/**
	 * Returns the current reading from the sensor.
	 * 
	 * @return	current integer raw value from the sensor
	 */
	int readValue();
	
	/**
	 * Gets the port of the sensor.
	 * 
	 * @return	the port of the sensor
	 */
	char getPort();
	
	/**
	 * Sets the port for the sensor.
	 * 
	 * @param port	the specified port for the sensor
	 */
	void setPort(char port);
	
	/**
	 * Gets the name of the sensor.
	 * 
	 * @return	the name of the sensor
	 */
	String getName();
	
	/**
	 * Sets the name of the sensor.
	 * 
	 * @param name	the name of the snesor that is specified
	 */
	void setName(String name);
}
