package lesson15_oop1;

public class Person {

	String name;
	int age;
	boolean hasDriverLicense;
	
	Person friend = null;
	
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
