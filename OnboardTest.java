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
		    			case "0001": // move individual motor
							if (fromControl[2].equals("1")) {
								b.getMotor(fromControl[3]).forward(Integer.parseInt(fromControl[1]));
							}
							else {
								b.getMotor(fromControl[3]).reverse(Integer.parseInt(fromControl[1]));
							}
		    				send("Motor " + fromControl[3] + " is moving " + fromControl[2] + " at speed " + fromControl[1]);
		    				//System.exit(0);
		    				break;
		    			case "0011": // sensor reading
							send("Sensor " + fromControl[1] + ": " + b.getSensor(fromControl[1]).readValue());
		    				//System.exit(0);
		    				break;
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
