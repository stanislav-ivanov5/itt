package oracleTutorialsOOP;

public class Bicycle {

	private int cadence = 0;
	private int speed = 0;
	private int gear = 0;
	
	public Bicycle(int startCadence, int startSpeed, int startGear){
		this.cadence = startCadence;
		this.speed = startSpeed;
		this.gear = startGear;
	}
	
	public int getCadence(){
		return this.cadence;
	}
	
	public void setCadence(int newCadence){
		this.cadence = newCadence;
	}
	
	public int getGear(){
		return this.gear;
	}
	
	public void setGear(int newGear){
		this.gear = newGear;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public void speedUp(int increment){
		speed += increment;
	}
	
	void applyBrakes(int decrement){
		speed -= decrement;
	}
	
	void printStates(){
		System.out.println("cadence: " + cadence + " speed: " + speed +
					" gear: " + gear);
	}
}
