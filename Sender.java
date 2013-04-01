import lejos.pc.comm.NXTComm;
import lejos.pc.comm.NXTCommException;
import lejos.pc.comm.NXTCommFactory;
import lejos.pc.comm.NXTInfo;


public class Sender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		//Communicator c = new Communicator();
		try {
			Communicator.establishConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String message1 = "0001 A 300";
		byte[] m = null;
		try {
			m = Communicator.convertMessageToByteArray(message1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Communicator.transmitMessage(m);*/
		NXTComm nxtComm = null;
		try {
			nxtComm = NXTCommFactory.createNXTComm(NXTCommFactory.BLUETOOTH);
		} catch (NXTCommException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(")
		NXTInfo[] nxtInfo = null;
		try {
			nxtInfo = nxtComm.search("LEAD9", 10);
		} catch (NXTCommException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		NXTInfo nxtInfo1  = nxtInfo[0];
		System.out.println(nxtInfo1);
		
		
	}

}
