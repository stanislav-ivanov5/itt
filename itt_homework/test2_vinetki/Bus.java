package test2_vinetki;

public class Bus extends Vehicle {

	private BusVinetka busVinetka;

	public Bus(String model, int yearProduction) {
		super(model, yearProduction);
	}
	
	@Override
	public int zalepiVinetka() {
		return 20;
	}

}
