package itt_l16_constructors;

public class CarShop {

	Car[] cars;
	static int capacity;
	
	public CarShop(int capacity){
		if(capacity >= 0 ){
			cars = new Car[capacity];
		}
		CarShop.capacity = capacity;
	}
	
	boolean addCar(Car car){
		if(car != null ){
			cars[cars.length - capacity] = car;
			
			CarShop.capacity--;
			return true;
		}
		return false;
	}
	
	Car getNextCar(){
		if(capacity < cars.length){
			return cars[cars.length - capacity - 1];			
		}
		return cars[cars.length - capacity];
	}
	
	void sellNextCar(Person buyer){
		if(buyer != null && buyer.car != null){
			buyer.car = this.getNextCar();
			buyer.car.changeOwner(buyer);
			removeCar(this.getNextCar());			
		}
		else {
			System.out.println("null reference");
		}
	}
	
	boolean removeCar(Car car){
		if(capacity < cars.length){
			cars[cars.length - capacity - 1] = null;
			CarShop.capacity++;
			return true;
		}
		else 
		if(capacity == cars.length) {
			cars[cars.length - capacity] = null;
			CarShop.capacity++;
			return true;
		}
		return false;
	}
	
	void showAllCarsInShop(){
		if(cars != null){
			for (int i = 0; i < cars.length; i++) {
				if(cars[i] != null){
					System.out.println(cars[i].getModel() + " " + cars[i].getColor() + " " + "" );
				}
			}
		}
	}
}
