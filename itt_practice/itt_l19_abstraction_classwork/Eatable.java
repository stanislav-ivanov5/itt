package lesson19_abstraction_classwork;

public interface Eatable {

	int MAX_EATABLE_WEIGHT = 3;
	
	public void eatMe();
	public int calculatePrice(int kg);
}
