import java.util.Scanner;


public class OnboardTest
	implements Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//if (args.length == 0)
			//System.exit(0);
		String[] fromControl;// = args;
		Scanner keyboard  = new Scanner(System.in);
		String message = "";
		
		//fromControl[0] = "0001";
		//LCD.drawString("Wait", 0, 0);
		//BTConnection btc = Bluetooth.waitForConnection();
	    //DataInputStream dis = btc.openDataInputStream();
	    while (!(message.equals("exit"))){
	    	System.out.println("message: ");
			message = keyboard.nextLine();
			fromControl = message.split(" ");
	    	//if (btc.available() > 0){
	    		try{
		    		//fromControl = dis.readUTF();
		    		//fromControl.split();
		    		switch(fromControl[0]){
						case "0000": // move in a direction (We'll assume motor A is left and motor B is right)
							if (fromControl[1].equals("left")) {
								b.getMotor("A").reverse(Integer.parseInt(fromControl[2]));
								b.getMotor("B").forward(Integer.parseInt(fromControl[2]));
							}
							else if (fromControl[1].equals("right") {
								b.getMotor("A").forward(Integer.parseInt(fromControl[2]));
								b.getMotor("B").reverse(Integer.parseInt(fromControl[2]));
							}
							else if (fromControl[1].equals("forward") {
								b.getMotor("A").forward(Integer.parseInt(fromControl[2]));
								b.getMotor("B").forward(Integer.parseInt(fromControl[2]));
							}
							else if (fromControl[1].equals("reverse") {
								b.getMotor("A").reverse(Integer.parseInt(fromControl[2]));
								b.getMotor("B").reverse(Integer.parseInt(fromControl[2]));
							}
		    			case "0001": // move individual motor
							if (fromControl[2].equals("forward")) {
								b.getMotor(fromControl[3]).forward(Integer.parseInt(fromControl[1]));
							}
							else {
								b.getMotor(fromControl[3]).reverse(Integer.parseInt(fromControl[1]));
							}
		    				send("Motor " + fromControl[3] + " is moving " + fromControl[2] + " at speed " + fromControl[1]);
		    				//System.exit(0);
		    				break;
						case "0010": // stop movement
							for (int i = 0; i < b.m.size(); i++) {
								b.m.stop();
							}
		    			case "0011": // sensor reading
							send("Sensor " + fromControl[1] + ": " + b.getSensor(fromControl[1]).readValue());
		    				//System.exit(0);
		    				break;
						case "0100": //Needs some clarification
						case "0101": // emergency stop
							emergencyStop();
						case "0110": // abort
							System.exit(1);
						case "1000": //Needs some clarification
		    			case "exit":
		    				System.exit(0);
		    				break;
		    			default:
		    				System.out.println("Invalid input.");
		    				//System.exit(0);
		    		}
		    	}
			    
			    catch(Exception e){
			    	//btc.close();
			    	System.out.println("Invalid input exception.");
			    	System.exit(0);
			    }
	    	}
	    }

	

}
