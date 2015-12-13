package lesson15_zad02;

public class CallDemo {

	public static void main(String[] args) {
		
		GSM gsm1 = new GSM();
		GSM gsm2 = new GSM();
		
		gsm1.insertSimCard("0888555888");
		gsm1.model = "nokia";
		
		gsm2.insertSimCard("0888333888");
		gsm2.model = "samsung";
		
		Call outgoingCall = new Call();
		
		gsm1.call(gsm2, 2.0f);
		gsm1.lastOutgoingCall = outgoingCall;
		
		System.out.println(gsm2.lastIncomingCall.receiver.simMobileNumber);
	}
}
