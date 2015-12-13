package lesson15_oop1;

public class Car {

	String model;
	int maxSpeed;
	int currentSpeed;
	String color;
	byte currentGear;
	Person owner = null;
	
	void changeGearUp(){
		if(currentGear < 6){
			this.currentGear++;
		}
		else {
			System.out.println("Wrong gear");
		}
	}
	
	void changeGearDown(){
		if(currentGear > 0){
			this.currentGear--;
		} 
		else {
			System.out.println("Wrong gear");
		}
	}
	
	void changeGear(byte nextGear){
		if(validateGear(nextGear)){
			this.currentGear = nextGear;
		}	
	}
	
	void changeColor(String newColor){
		if(newColor != null){
			this.color = newColor;
		}
	}
	
	boolean validateGear(byte gear){
		if(gear > 7 || gear < 1){
			System.out.println("Wrong gear");
			return false;
		}
		return true;
	}
	
	void changeSpeed(){
		this.currentSpeed = 60;
	}
	
	void accelerate(){
		this.currentSpeed *= 2;
	}
	
	
}
