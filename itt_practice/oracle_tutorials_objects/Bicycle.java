package oracleTutorialsObjects;

public class Bicycle {

	private int cadence;
	private int gear;
	private int speed;
	private int id;
	
	private static int numberOfBicycles = 0;
	
	public Bicycle(int startCadence, int startGear, int startSpeed){
		this.gear = startGear;
		this.cadence = startCadence;
		this.speed = startSpeed;
		
		id = ++numberOfBicycles;
	}
	
	public int getID(){
		return this.id;
	}
}
