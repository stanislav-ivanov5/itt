package oop_gsm_caller;

public class GSM {
	String model;
	CallHistory callhistory;
	SimCard simCard;

	void insertSimCard(String simMobileNumber) {
		if (simMobileNumber != null) {
			if (simMobileNumber.length() == 10 && simMobileNumber.startsWith("08")) {
				this.simCard = new SimCard(simMobileNumber);
			}
		}
	}

	void removeSimCard() {
		this.simCard = null;
	}

	void call(GSM receiver, int duration) {
		if ((receiver != null) && (receiver.simCard != null)) {
			if (duration > 0 && duration <= 60) {
				if (this.simCard != null && 
						!this.simCard.simMobileNumber.equals(
								receiver.simCard.simMobileNumber)) {
					if (this != receiver) {
						// create a new call
						Call newCall = new Call();
						newCall.caller = this;
						newCall.receiver = receiver;
						newCall.duration = duration;

						this.callhistory = new CallHistory(duration, 
								null, newCall);
						receiver.callhistory = 
								new CallHistory(duration, newCall, null);
					}
				}
			}
		}
	}

	double getSumForCalls() {
		if (this.callhistory.lastOutgoingCall == null) {
			return 0.0;
		}
		return this.callhistory.outgoingCallsDuration * this.callhistory.lastOutgoingCall.priceForAMinute;
	}

	void printInfoForCall(Call call) {
		if (call != null) {
			System.out.println(call.caller.simCard.simMobileNumber + " se obajda na " + 
						call.receiver.simCard.simMobileNumber
					+ " za tolkova vreme " + call.duration);
		}
	}

	void printInfoForLastIncomingCall() {
		printInfoForCall(this.callhistory.lastIncomingCall);
	}

	void printInfoForLastOutgoingCall() {
		printInfoForCall(this.callhistory.lastOutgoingCall);
	}

}
