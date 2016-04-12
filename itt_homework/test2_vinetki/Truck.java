package test2_vinetki;

public class Truck extends Vehicle {

	private TruckVinetka truckVinetka;

	public Truck(String model, int yearProduction) {
		super(model, yearProduction);
	}
	
	@Override
	public int zalepiVinetka() {
		return 5;
	}

}
