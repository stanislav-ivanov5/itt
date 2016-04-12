package oracleTutorialsOOP;

public class BicycleDemo {

	public static void main(String[] args) {
		
		Bicycle bike1 = new Bicycle(50, 10, 2);
		Bicycle bike2 = new Bicycle(40, 15, 3);
		
		bike1.setCadence(50);
		bike1.speedUp(10);
		bike1.setGear(2);
		bike1.printStates();
		
		bike2.setCadence(40);
		bike2.speedUp(15);
		bike2.setGear(3);
		bike2.printStates();
	}
}
