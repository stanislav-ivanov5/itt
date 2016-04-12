package oop2_practice;

public class Car {

	String model;
	int maxSpeed;
	int currentSpeed;
	String color;
	byte currentGear;
	Person owner;
	int price;
	boolean isSportCar;
	
	// default constructor
	Car(){
		this.model = "car";
		this.maxSpeed = 140;
		this.currentGear = 3;
		this.color = "gray";
		this.owner = new Person();
	}
	
	// constructor
	Car(String modelParam, boolean isSportCarParam, String colorParam){

		if(modelParam != null){
			this.model = modelParam;
		}
		else {
			this.model = "model";
		}
		
		
		if(colorParam != null){
			this.color = colorParam;
		}
		else{
			this.color = "color";
			System.out.println("no such color");
		}
		
		this.price = 2000; 
		this.isSportCar = isSportCarParam;			
		this.currentSpeed = 50;
		this.currentGear = 3;
	}
	
	// methods
	
	boolean isMoreExpensive(Car car){
		if(car != null){
			return  this.price > car.price;
		}
		return  true;
	}
	
	double calculateCarPriceForScrap(double metalPrice){
		float coef = 0.2f;
		
		if(this.color.equalsIgnoreCase("black") || this.color.equalsIgnoreCase("white")
				|| this.isSportCar == true){
			coef += 0.05;
		}
		
		double price = metalPrice * coef;
		
		return price;
	}
	
	
	void changeOwner(Person newOwner){
		if(newOwner != null){
			this.owner = newOwner;
			newOwner.car = this;
		}
	}
	
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
