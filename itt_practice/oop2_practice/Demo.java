package oop2_practice;

public class Demo {

	public static void main(String[] args) {
		
		Car newCar = new Car("Fiat", true, "red");
		
		
		Person goro = new Person("goro", 12345, true);
		System.out.println(goro.friends[0].name);
		
		
		Car fcar = new Car();
		fcar.price = 5000;
		
		Car car = new Car();
		car.price = 500;
		System.out.println(fcar.isMoreExpensive(car));
		
		car.color = "black";
		double metalPrice = 5;
		System.out.println(car.calculateCarPriceForScrap(metalPrice));
		
		
		
	}
}
