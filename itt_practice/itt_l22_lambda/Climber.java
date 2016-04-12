package lesson22_lambda;

public class Climber {

	public static void main(String[] args) {
//		ERROR
//		check((h, l) -> h.append(l).isEmpty(), 5);
	}

	private static void check(IClimb climb, int height) {
		if (climb.isTooHigh(height, 10))
			System.out.println("too high");
		else
			System.out.println("ok");
	}
}
