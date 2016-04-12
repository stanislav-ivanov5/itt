package lesson19_abstraction_classwork_2;

public class Whiskey extends SpirtDrink implements IDrinkable, IAlcohol {

	@Override
	public void keepSpirt() {
		System.out.println("Az sydyrjam 40% alkohol.");
	}
	
	@Override
	public void izparqvaSe() {
		IAlcohol.super.izparqvaSe();
	}

	
}
