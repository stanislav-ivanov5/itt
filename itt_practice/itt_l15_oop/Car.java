package itt_l15_oop;

public class Car {

	private static final int MAX_GEAR = 8;
	private static final int MIN_GEAR = 0;
	private static final int DEFAULT_GEAR = 1;
	private static final String DEFAULT_COLOR = "color";
	private static final int MIN_CURR_SPEED = 0;
	private static final int MAX_CURR_SPEED = 150;
	private static final int DEFAULT_CURR_SPEED = 0;
	private static final int MIN_SPEED = 0;
	private static final int MAX_SPEED = 330;
	private static final int DEFAULT_MAX_SPEED = 0;
	private static final String DEFAULT_MODEL = "model";
	
	private String model;
	private int maxSpeed;
	private int currentSpeed;
	private String color;
	private char currentGear;
	private Person owner;
	
	public Car(){
		
	}
	
	public void setModel(String model){
		this.model = (model != null) ? model : DEFAULT_MODEL;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = (maxSpeed > MIN_SPEED && maxSpeed < MAX_SPEED) ? maxSpeed : DEFAULT_MAX_SPEED;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = (currentSpeed > MIN_CURR_SPEED && currentSpeed < MAX_CURR_SPEED) 
				? currentSpeed : DEFAULT_CURR_SPEED;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = (color != null) ? color : DEFAULT_COLOR;
	}

	public char getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(char currentGear) {
		if(currentGear == 'r' || currentGear == 'R'){
			this.currentGear = currentGear;
			return;
		}
		this.currentGear = ((int)currentGear > MIN_GEAR && (int)currentGear < MAX_GEAR) 
				? currentGear : DEFAULT_GEAR;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = (owner != null) ? owner : new Person();
	}
	
	
}
