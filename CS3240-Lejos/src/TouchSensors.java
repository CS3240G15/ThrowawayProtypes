import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class TouchSensors extends Sensor {
	private TouchSensor touch;
	public TouchSensors(char port) {
		super(port);
		
		switch(port) {
		case '1':
			touch = new TouchSensor(SensorPort.S1);
		case '2':
			touch = new TouchSensor(SensorPort.S2);
		case '3':
			touch = new TouchSensor(SensorPort.S3);
		case '4':
			touch = new TouchSensor(SensorPort.S4);
			// TODO Auto-generated constructor stub
		}
	}

		@Override
		float getReading() {
			if (touch.isPressed())
				return 1;
			return 0;

	}

	@Override
	boolean isActive() {
		// TODO Auto-generated method stub
		return connected;
	
	}

	@Override
	char getPort() {
		// TODO Auto-generated method stub
		return port;
	}

	@Override
	void setPort(char p) {
		port = p;
		// TODO Auto-generated method stub

	}

}
