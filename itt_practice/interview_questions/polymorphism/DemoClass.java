package tutorialspoint.questions.polymorphism;

public class DemoClass {

	public static void main(String[] args) {

//		Animal animal = new Animal();
		Bird dove = new Bird();
		Dog shepherd = new Dog();
		
//		Animal pitbul = new Dog();
		Bird eagle = new Eagle();
		
		dove.fly();
		
		eagle.fly();
		shepherd.bark();
		
		
		
	}

}
