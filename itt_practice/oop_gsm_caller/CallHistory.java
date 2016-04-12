package oop_gsm_caller;

public class CallHistory {
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	
	public CallHistory(int outgoingCallsDuration, Call lastIncomingCall, Call lastOutgoingCall) {
		this.outgoingCallsDuration = outgoingCallsDuration;
		this.lastIncomingCall = lastIncomingCall;
		this.lastOutgoingCall = lastOutgoingCall;
	}
}
