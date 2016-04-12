package test2_vinetki;

import java.time.Period;
import java.util.Arrays;

public class Driver {

	private static final String EMPTY_STRING = "";
	private static final int DEFAULT_MONEY = 0;
	private static final int MIN_MONEY = 0;

	private String name;
	private Vehicle[] vehicles;
	private double money;
	private GasStation gasStation;

	public Driver(String name, int vehiclesNum) {
		setName(name);
		vehicles = new Vehicle[vehiclesNum];
	}

	public void addVehicle(Vehicle vehicle) {
		if (vehicle != null) {

			for (int index = 0; index <= vehicles.length; index++) {
				if (vehicles[index] == null) {
					vehicles[index] = vehicle;
					vehicles[index].addDriver(this);
					break;
				}
			}
		}
	}

	public void printDriverInformation() {

		for (Vehicle v : vehicles) {
			if (v != null) {

				System.out.println(this.getName() + " drives " + v.getModel());
			}
		}
		System.out.println("Money " + this.getMoney());
		System.out.println();
	}

	public void setGasStation(GasStation station) {
		if (station != null) {
			this.gasStation = station;
		}
	}

	public void setMoney(double money) {
		this.money = (money > MIN_MONEY) ? money : DEFAULT_MONEY;
	}

	public double getMoney() {
		return this.money;
	}

	public void buyVinetka(int vehicleIndex, Period period) {
		if (vehicles[vehicleIndex] == null) {
			
//			Vinetka vinetka = gasStation.sellVinetka(vehicles[vehicleIndex].);
			
		}
	}

	public void buyVinetkaForAllVehicles() {
		for(Vehicle v : vehicles){
			if(v != null){
			
			}
		}
	}

	private void setName(String name) {
		this.name = (name != null) ? name : EMPTY_STRING;
	}

	public String getName() {
		return this.name;
	}
	
	public Vehicle[] getVehicles(){
		return Arrays.copyOf(this.vehicles, vehicles.length);
	}

}
