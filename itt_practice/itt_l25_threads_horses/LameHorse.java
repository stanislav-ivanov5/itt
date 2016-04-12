package lesson25_threads_horses;

public class LameHorse  extends Horse{

	@Override
	String getHorseName() {
		return "lame horse " + super.getHorseName();
	}
	
	@Override
	protected int getTimeToRunAMile() {
		return 2 * super.getTimeToRunAMile();
	}
}
