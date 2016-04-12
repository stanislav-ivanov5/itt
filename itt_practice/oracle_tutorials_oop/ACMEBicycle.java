package oracleTutorialsOOP;

public class ACMEBicycle implements BicycleInterface {

	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	public void changeCadence(int newCadence){
		this.cadence = newCadence;
	}
	
	public void changeGear(int newGear){
		this.gear = newGear;
	}
	
	public void speedUp(int increment){
		this.speed += increment;
	}
	
	public void applyBrakes(int decrement){
		this.speed -= decrement;
	}
	
	void printStates(){
		System.out.println("cadence: " + cadence + " speed: " + speed +
					" gear: " + gear);
	}
}
