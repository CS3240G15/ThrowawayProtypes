import lejos.robotics.*;
///\import edu.virginia.CommunicationsProtocol.Communicator;
public class Controller {
	private Motors LeftMotor, RightMotor;
	private Sensor Port1Sensor, Port2Sensor, Port3Sensor, Port4Sensor;
	//private Communicator communicator;
	public Controller() {
		
	}
	public Controller(Motors left, Motors right, Sensor port1, Sensor port2, Sensor port3, Sensor port4)
	{
		LeftMotor = left;
		RightMotor = right;
		Port1Sensor = port1;
		Port2Sensor = port2;
		Port3Sensor = port3;
		Port4Sensor = port4;
		try {
			//Communicator.establishConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void move (int speed) {
		byte[] message = new byte[3];
		message[0] = 0000;
		message[1] = 00;
		message[2] = (byte) speed;
		//Communicator.transmitMessage(message);
		LeftMotor.move(speed);
		RightMotor.move(speed);
	}
	public void turn (int degree) {
		if (degree > 0 && degree <= 90) {
			LeftMotor.move(degree);
			RightMotor.move(90-degree);
		}
		else if (degree < 0 && degree >= -90) {	
			RightMotor.move(-1*degree);
			LeftMotor.move(90+degree);
		}
		else if (degree > 90 && degree <= 180) {
			LeftMotor.move(degree);
			RightMotor.move(180-degree);	
		}
		else if (degree < -90 && degree >= -180) {
			RightMotor.move(degree);
			LeftMotor.move(180+degree);	
		}
	}
	public float getReading (int port) {
		float reading = -1; 
		byte[] message = new byte[2];
		message[0] = 0011;
		message[1] = (byte)port;
		//Communicator.transmitMessage(message);
		switch(port) {
		case 1: 
			reading = Port1Sensor.getReading();
		case 2:
			reading = Port2Sensor.getReading();
		case 3:
			reading = Port3Sensor.getReading();
		case 4:
			reading = Port4Sensor.getReading();
		}
		return reading;
	}
	public void EmergencyStop() {
		byte[] message = new byte[1];
		message[0] = 0101;
		//Communicator.transmitMessage(message);
		LeftMotor.stop();
		RightMotor.stop();
	}
}

