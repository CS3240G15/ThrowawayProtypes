import java.io.*;
import java.util.*;

public class TestUI {
	private static Controller controller;
	private static Motors LeftMotor;
	private static Motors RightMotor;
	private static Sensor Port1Sensor, Port2Sensor, Port3Sensor, Port4Sensor;
	public static void main(String[] args) {
		char p = '1';
		Port1Sensor = new TouchSensors(p);
		Port2Sensor = new TouchSensors(p);
		Port3Sensor = new TouchSensors(p);
		Port4Sensor = new TouchSensors(p);
		LeftMotor = new LeftMotor('A');
		RightMotor = new RightMotor('B');
		controller = new Controller(LeftMotor, RightMotor, Port1Sensor, Port2Sensor, Port3Sensor, Port4Sensor);
		System.out.println("What do you want to do?");
		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		if (next.toLowerCase().equals("move")) {
			System.out.println("What speed?");
			int speed = sc.nextInt();
			System.out.println("What direction (forward, left, right, backwards)?");
			String direction = sc.next().toLowerCase();
			move(speed, direction);	
		}
	}

	private static void move(int speed, String direction) {
		if (direction.equals("forward"))
			controller.move(speed);
		else if (direction.equals("left")) {
			controller.turn(90);
			controller.move(speed);
		}
		else if (direction.equals("right")) {
			controller.turn(270);
			controller.move(speed);
		}
		else if (direction.equals("backwards")) {
			controller.turn(180);
			controller.move(speed);
		}
	}
}

