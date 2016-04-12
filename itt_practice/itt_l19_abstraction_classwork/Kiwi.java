package lesson19_abstraction_classwork;

public class Kiwi implements Eatable {

	@Override
	public void eatMe() {
		System.out.println("Kiwi dissapeared. ");
	}

	@Override
	public int calculatePrice(int kg) {
		return 5 * kg;
	}

}
