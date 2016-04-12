package softacadClassesPractice;

public class Car {

	String model;
	int maxSpeed;
	int currentSpeed;
	String color;
	byte currentGear;
	Person owner;
	double price;
	boolean isSportCar;
	
	Car(){
		this.model = "";
		this.currentGear = 0;
		this.price = 0.0f;
		this.isSportCar = false;
	}
	
	Car (String modelParam, boolean isSportCarParam, 
			String colorParam){
		this();
		if(modelParam != null){
			this.model = modelParam;			
		}
		else {
			this.model = "model";
		}
		this.isSportCar = isSportCarParam;
		if(colorParam != null){
			this.color = colorParam;			
		}
		else {
			this.color = "color";
		}
	}
	
	Car(String model, boolean isSportCar, String color, double price, int maxSpeed){
		this(model, isSportCar, color);
		
		if(price > 1000){
			this.price = price;
		}
		else {
			this.price = 500;
		}
		
		if(maxSpeed > 50){
			if(maxSpeed > 200 && isSportCar ){
				this.maxSpeed = maxSpeed;
			}
			this.maxSpeed = maxSpeed;
		}
		else{
			this.maxSpeed = 50;
		}
		
	}
	
	void accelerate(){
		this.currentSpeed = 100;
	}
	
	void changeGearUp(){
		this.currentGear++;
	}
	
	void changeGearDown(){
		this.currentGear--;
	}
	
	void changeGear(byte newGear){
		if(newGear > 1 && newGear < 6){
			this.currentGear = newGear;
		}
	}
	
	void changeColor(String newColor){
		this.color = newColor;
	}
}
