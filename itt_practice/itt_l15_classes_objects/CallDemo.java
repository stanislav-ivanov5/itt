package itt_l15_classes_objects;

public class CallDemo {

	public static void main(String[] args) {
		
		GSM nokia = new GSM();
		GSM sam = new GSM();
		
		nokia.insertSimCard("0888555888");
		sam.insertSimCard("0888444777");
		
		nokia.call(sam, 5);
		nokia.printInfoForLastOutgoingCall();
		
		sam.printInforForLastIncomingCall();
	}
}
