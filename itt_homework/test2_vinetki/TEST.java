package test2_vinetki;

import java.time.Period;

public class TEST {

	private static final int DRIVERS_NUM = 20;
	private static final int INITIAL_NUM_VEHICLES = 10;
	private static Driver[] drivers;

	public static void main(String[] args) {

		
		GasStation gasStationOne = GasStation.getGasStation();

		// print vinetka properties
		printVinetkaProperties(gasStationOne);
		System.out.println();

		// create drivers
		generateDrivers(gasStationOne);

		// generate 200 vehicles and distribute them to drivers
		generateVehiclesForDriver();

		// print driver information
		for (Driver d : drivers) {
			d.printDriverInformation();
		}
		
		for(int index = 0; index < drivers.length; index++){
			if(index % 3 == 0){
				for(int i = 0; i < 5; i++){
					int randomVehicleIndex = (int) ((Math.random() * (10 - 1)) + 1);
					int randomPeriod = (int) ((Math.random() * (3 - 1)) + 1);
					
					Period period = Period.ofDays(1);
					if(randomPeriod == 1){
						period = Period.ofDays(1);
					}
					if(randomPeriod == 2){
						period = Period.ofMonths(1);
					}
					if(randomPeriod == 3){
						period = Period.ofYears(1);
					}
					
					drivers[index].buyVinetka(randomVehicleIndex, period);
				}
			}
			else {
				drivers[index].buyVinetkaForAllVehicles();
			}
			
			
		}
	}

	static void generateVehiclesForDriver() {
		int random = 1;
		int year = 2000;

		for (int index = 0; index < DRIVERS_NUM; index++) {
			for(int i = 0; i < 10; i++){
				random = (int) (Math.random() * (3 - 0)) + 1;
				
				if (random == 1) {
					drivers[index].addVehicle(new Truck("Truck", year));
				}
				if (random == 2) {
					drivers[index].addVehicle(new Bus("Bus", year));
				}
				if (random == 3) {
					drivers[index].addVehicle(new Car("Car", year));
				}	
			}
		}
	}
	

	static void generateDrivers(GasStation gasStationOne) {
		drivers = new Driver[20];
		String driverName;
		int count = 1;
		double money = 2000;

		for (int i = 0; i < drivers.length; i++) {

			driverName = "Driver" + count;
			// create drivers
			drivers[i] = new Driver(driverName, INITIAL_NUM_VEHICLES);
			// set gas station
			drivers[i].setGasStation(gasStationOne);

			count++;
			// set their money
			drivers[i].setMoney(money);
			money += 50;
		}
	}

	// print vinetka properties
	public static void printVinetkaProperties(GasStation gasStationOne) {
		for (Vinetka v : gasStationOne.getVinetki()) {
			v.printProperties();
		}
	}
}
