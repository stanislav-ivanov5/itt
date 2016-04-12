package test2_vinetki;

public class Car extends Vehicle {

	private CarVinetka carVinetka;

	public Car(String model, int yearProduction) {
		super(model, yearProduction);
	}

	@Override
	public int zalepiVinetka(Vinetka vinetka) {
		this.carVinetka = (CarVinetka) vinetka;
		return 10;
	}

	@Override
	public int zalepiVinetka() {
		// TODO Auto-generated method stub
		return 0;
	}
}
