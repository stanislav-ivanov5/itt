package lesson19_abstraction_classwork_2;

public interface IDrinkable {
	
	// only Java 1.8 or later
	default void izparqvaSe() {
		System.out.println("Vsqka technost se izparqva!");
	}
}
