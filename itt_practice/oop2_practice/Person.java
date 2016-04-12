package oop2_practice;

public class Person {

	int age;
	float weight;
	long personalNumber;
	String name;
	boolean hasDriverLicense;
	boolean isMale;
	float money;
	Car car;
	
	Person[] friends;
	
	Person(){
		this.name = "sir templeton";
		this.age = 0;
		this.weight = 4.0f;
		this.friends = new Person[3];
		hasDriverLicense = true;
		this.car = new Car();
	}
	
	Person(String name, long personalNumber, boolean isMale){
		this();
		
		for (int i = 0; i < friends.length; i++) {
			this.friends[i] = new Person();
		}
		
		if(personalNumber < 1000000000){
			System.out.println("wrong number");
			this.personalNumber = 1000000000;
		}
		else {
			this.personalNumber = personalNumber;			
		}
		this.isMale = isMale;
	}
	
	void buyCar(Car car){
		if(car != null){
			if(this.money >= car.price){
				this.car = new Car();
				car.owner = this;
				System.out.println("Buy car");
			}
			else{
				System.out.println("don't buy car");
			}			
		}
	}
	
	
	double sellCarForScrap(){
		if(car != null){
			return money + this.car.calculateCarPriceForScrap(0.3);			
		}
		else {
			return 0;
		}
	}
	
	void addFriend(){
		
	}
	
	void eat(){
		System.out.println(this.name + " eats");
	}
	
	void walk(){
		System.out.println(this.name + " walks");
	}
	
	int growUp(){
		this.age++;
		return this.age;
	}
	
	void drinkWater(double liters){
		System.out.println(this.name + " drank " + liters + " liters");
	}
}
