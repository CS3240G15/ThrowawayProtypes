import javax.bluetooth.BluetoothStateException;

import lejos.addon.keyboard.KeyListener;
import lejos.addon.keyboard.Keyboard;
import lejos.nxt.*;
import lejos.robotics.Touch;

public class HelloWorld {

	public static void main(String[] args) throws BluetoothStateException{
		System.out.println("Hello World");
		Button.waitForAnyPress();
		
		Motor.A.forward();
		//ADSensorPort a = new ADSensorPort(1);
		TouchSensor t = new TouchSensor(SensorPort.S1);
		//for (int i = 0; i < 100; i++){
			//System.out.println(i);	
		//}
		Button.waitForAnyPress();
		Motor.A.backward();
		Button.waitForAnyPress();
		Motor.A.stop();
		System.out.println("Finished");
		Button.waitForAnyPress();
		Keyboard k = new Keyboard();
		//k.addKeyListener(new KeyListener());
	}
}