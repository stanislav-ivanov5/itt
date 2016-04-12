package itt_l15_classes_objects;

public class GSM {

	private static final int MIN_OUTGOING_CALL_DURATION = 0;
	private static final int DEFAULT_OUTGOING_CALL_DURATION = 0;
	private static final int MAX_CALL_DURATION = 60;
	private static final int MIN_CALL_DURATION = 0;
	private static final String DEFAULT_MODEL = "model";
	private static final String DEFAULT_SIM_MOB_NUM = "0800000000";
	private static final String MOBILE_NUM_PREFIX = "08";
	private static final int SIM_NUM_LENGTH = 10;
	
	private String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private int outgointCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	
	void insertSimCard(String simMobileNum){
		if(simMobileNum.startsWith(MOBILE_NUM_PREFIX) && simMobileNum.length() == SIM_NUM_LENGTH){
			setSimMobileNumber(simMobileNum);
			setHasSimCard(true);
		}
	}

	void removeSimCard(){
		setHasSimCard(false);
		setSimMobileNumber(DEFAULT_SIM_MOB_NUM);
	}
	
	void call(GSM receiver, int duration){
		if(duration >= MIN_CALL_DURATION && duration < MAX_CALL_DURATION &&
				!this.equals(receiver) && this.hasSimCard && receiver.hasSimCard){
			this.lastOutgoingCall = new Call();
			this.lastOutgoingCall.caller = this;
			this.lastOutgoingCall.receiver = receiver;
			receiver.lastIncomingCall = this.lastOutgoingCall;
			this.lastOutgoingCall.setDuration(duration);
			receiver.lastIncomingCall.setDuration(duration);
			setOutgointCallsDuration(getOutgointCallsDuration() + duration); 
		}
	}
	
	int getSumForCall(){
		return (int) (Call.getPriceForMinute() * this.getOutgointCallsDuration());
	}
	
	void printInfoForLastOutgoingCall(){
		if(this.lastOutgoingCall != null){
			System.out.println(getSimMobileNumber() + " duration: " + this.lastOutgoingCall.getDuration() + 
					" price: " + this.lastOutgoingCall.getDuration() * Call.getPriceForMinute());			
		}
	}
	
	void printInforForLastIncomingCall(){
		if(this.lastIncomingCall != null){
			System.out.println(this.getSimMobileNumber() + " duration: " + this.lastIncomingCall.getDuration() + 
					" price: " + this.lastIncomingCall.getDuration() * Call.getPriceForMinute());			
		}
	}
	
	// get and set methods
	public boolean isHasSimCard() {
		return hasSimCard;
	}

	public void setHasSimCard(boolean hasSimCard) {
		this.hasSimCard = hasSimCard;
	}

	public String getSimMobileNumber() {
		return simMobileNumber;
	}

	public void setSimMobileNumber(String simMobileNumber) {
		this.simMobileNumber = (simMobileNumber != null) ? simMobileNumber : DEFAULT_SIM_MOB_NUM;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = (model != null) ? model : DEFAULT_MODEL;
	}

	public int getOutgointCallsDuration() {
		return outgointCallsDuration;
	}

	public void setOutgointCallsDuration(int outgointCallsDuration) {
		this.outgointCallsDuration = (outgointCallsDuration >= MIN_OUTGOING_CALL_DURATION) ? 
				outgointCallsDuration : DEFAULT_OUTGOING_CALL_DURATION;
	}
}
