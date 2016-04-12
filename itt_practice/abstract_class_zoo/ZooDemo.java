package abstractClassZoo;

import java.util.Arrays;

public class ZooDemo {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo(5);
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Bird birdy = new Bird();

		zoo.addAnimal(birdy);
		zoo.addAnimal(dog);
		zoo.addAnimal(cat);
		zoo.addAnimal(null);

		zoo.printZooInfor();
	}
}
