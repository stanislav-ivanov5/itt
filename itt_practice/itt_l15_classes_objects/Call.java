package itt_l15_classes_objects;

public class Call {

	private static final int MIN_DURATION = 0;
	private static final int MAX_DURATION = 60;
	private static final int DEFAULT_DURATION = 0;
	private static final int MIN_PRICE = 0;
	private static final int DEFAULT_PRICE = 0;

	private static double priceForMinute = 0.2;
	GSM caller;
	GSM receiver;
	private int duration;
	
	public static double getPriceForMinute() {
		return priceForMinute;
	}
	public static void setPriceForMinute(double priceForMinute) {
		Call.priceForMinute = (priceForMinute > MIN_PRICE) ? priceForMinute : DEFAULT_PRICE;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = (duration >= MIN_DURATION && duration < MAX_DURATION) ? 
				duration : DEFAULT_DURATION;
	}
}
