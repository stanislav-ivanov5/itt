package lesson19_abstraction_classwork_2;

public interface IAlcohol {
	
	public abstract void keepSpirt();
	void burn();
	
	//only Java 1.8 or later
	default void izparqvaSe() {
		burn();
		System.out.println("Vseki alcohol se izparqva!");
	}
}	
