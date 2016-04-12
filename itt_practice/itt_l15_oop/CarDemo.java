package itt_l15_oop;

public class CarDemo {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setColor("white");
		car2.setCurrentGear('r');
		
		Person ivan = new Person();
		ivan.setName("Ivan");
		car1.setOwner(ivan);
		
		System.out.println(car1.getOwner().getName());
	}
}
