package lesson15_zad02;

public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	float outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	
	void insertSimCard(String simMobileNumber){
		boolean isValidNumber = simMobileNumber.substring(0, 2).equals("08") && simMobileNumber.length() == 10;
		if(isValidNumber){
			this.hasSimCard = true;
			this.simMobileNumber = simMobileNumber;
		}
	}
	
	void removeSimCard(){
		this.hasSimCard = false;
	}
	
	void call(GSM receiver, float duration){

		Call call = new Call();
		call.caller = this;
		call.receiver = receiver;
		call.duration = duration;
		
		this.lastOutgoingCall = call;
		receiver.lastIncomingCall = call;
	}
}
