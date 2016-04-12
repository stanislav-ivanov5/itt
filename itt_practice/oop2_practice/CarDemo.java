package oop2_practice;

public class CarDemo {

	public static void main(String[] args) {
		
		Car bmw = new Car();
		Car myCar = new Car();
		

		
		bmw.color = "black";
		bmw.currentGear = 3;
		bmw.currentSpeed = 140;
		bmw.maxSpeed = 255;
		bmw.model = "318";
		
		
		bmw.changeSpeed();
		System.out.println(bmw.currentSpeed);
		
		myCar.color = "blue";
		myCar.currentGear = 2;
		myCar.currentSpeed = 50;
		myCar.maxSpeed = 125;
		myCar.model = "jazz";
		
		// change gear
		myCar.changeGearUp();
		
		System.out.println(myCar.currentGear);
		
		Person gosho = new Person();
		gosho.name = "Gosho";
		gosho.age = 75;
		
		myCar.owner = gosho;
		
		System.out.println(myCar.owner.name);
		
		myCar.owner.age = 25;
		
		System.out.println(myCar.owner.age);
		
		myCar.changeGear((byte) -2);
		myCar.changeGearUp();
		System.out.println(myCar.currentGear);
		
		myCar.changeColor(null);
		System.out.println(myCar.color);
		
	}
	
	
}
