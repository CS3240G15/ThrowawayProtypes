import java.util.Scanner;


public class OnboardTest {

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
		    			case "0001": // move
		    				String speed = fromControl[1];
		    				String direction = fromControl[2];
		    				String motor = fromControl[3];
		    				System.out.println("Motor " + motor + " is moving " + direction + " at speed " + speed);
		    				//System.exit(0);
		    				break;
		    			case "0011": // sensor reading
		    				String port = fromControl[1];
		    				//String raw = fromControl[2];
		    				//String motor = fromControl[3];
		    				System.out.println("Read sensor " + port);
		    				System.out.println("Value from robot: [value here]");
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
