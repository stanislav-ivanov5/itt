package lesson15_oop1;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person gosho = new Person();
		
		gosho.name = "Gosho";
		
		gosho.drinkWater(6.0);
		gosho.eat();
		gosho.walk();
		
		gosho.age = 55;
		gosho.growUp();
		System.out.println(gosho.age);
		
	}
}
