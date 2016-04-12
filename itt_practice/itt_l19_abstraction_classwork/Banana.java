package lesson19_abstraction_classwork;

public class Banana implements Eatable {

	@Override
	public void eatMe() {
		System.out.println("Banan goes away. Peel has only left.");
	}

	@Override
	public int calculatePrice(int kg) {
		return 3 * kg;
	}

}
