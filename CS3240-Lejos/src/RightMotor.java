import lejos.nxt.Motor;
import lejos.nxt.TouchSensor;
import lejos.robotics.navigation.DifferentialPilot;

public class RightMotor extends Motors {

	public RightMotor(char port) {
		super(port);
		// TODO Auto-generated constructor stub
	}

	@Override
	void move(int speed) {
		if (port == 'A'){
			//Motor.A.move(500, speed);
			Motor.A.setSpeed(speed);
			Motor.A.forward();
		}
		if (port == 'B'){
			//Motor.A.move(500, speed);
			Motor.B.setSpeed(speed);
			Motor.B.forward();
		}
		if (port == 'C'){
			//Motor.A.move(500, speed);
			Motor.C.setSpeed(speed);
			Motor.C.forward();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		if (port == 'A'){
			//Motor.A.move(500, speed);
			Motor.A.stop();
		}
		if (port == 'B'){
			//Motor.A.move(500, speed);
			Motor.B.stop();
		}
		if (port == 'C'){
			//Motor.A.move(500, speed);
			Motor.C.stop();
		}
		// TODO Auto-generated method stub
		
	}

}
