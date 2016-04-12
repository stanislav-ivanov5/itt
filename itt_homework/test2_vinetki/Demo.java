package test2_vinetki;

public class Demo {

	private static final int INITIAL_NUM_VEHICLES = 10;

	public static void main(String[] args) {

		GasStation gasStationOne = GasStation.getGasStation();

		int length = gasStationOne.getVinetki().length;

		
		// print vinetka properties
		for (int i = 0; i < length; i++) {
			for (Vinetka v : gasStationOne.getVinetki()) {
				v.printProperties();
			}
		}

		// create drivers
		Driver[] drivers = new Driver[20];
		String driverName;
		int count = 1;
		double money = 2000;

		for (int i = 0; i < drivers.length; i++) {

			driverName = "driver" + count;
			// create drivers
			drivers[i] = new Driver(driverName, INITIAL_NUM_VEHICLES);
			// set gas station
			drivers[i].setGasStation(gasStationOne);

			count++;
			// set their money
			drivers[i].setMoney(money);
			money += 5;
		}

		int driverPosition = 0;
		int counter = 1;
		int year = 2000;

		for (int i = 0; i < 200; i++) {
			counter = (int) (Math.random() * (3 - 1)) + 1;

			if (counter == 1) {
				drivers[i].addVehicle(new Truck("truck", year));
			}
			if (counter == 2) {
				drivers[i].addVehicle(new Bus("truck", year));
			}
			if (counter == 3) {
				drivers[i].addVehicle(new Car("truck", year));
			}

		}

		// print driver information
		for (Driver d : drivers) {
			d.printDriverInformation();
		}

	}
}
