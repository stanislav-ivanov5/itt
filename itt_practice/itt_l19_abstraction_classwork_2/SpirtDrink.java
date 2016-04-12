package lesson19_abstraction_classwork_2;

public abstract class SpirtDrink implements IAlcohol {
	
	int quantity;
	
	public SpirtDrink() {
	}
	
	
	public void burn() {
		keepSpirt();
		System.out.println("Burn.");		
		explode();
	}
	

	
	
	private void explode() {
		System.out.println("Exploded.");
	}
	
}
