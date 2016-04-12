package tutorialspoint.questions.modifiers;

public class Modifiers {

	public static final int NUM = 6;
	private String name;
	public int a;
	byte p;

	public String getName() {
		return name;
	}
	
	public synchronized void increment(int a) {
		a++;
	}
}
