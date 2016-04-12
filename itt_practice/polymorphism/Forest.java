package polymorphism;

public class Forest {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		
		Dog d = new Terier();
		
		Cat c = new Cat();
		
		Animal b = new Bird();
		
		
		a.walk();
		d.walk();
		c.walk();
		b.walk();
		c.sing();
		
		if(b instanceof Bird){
			((Bird)b).sing();			
		}
	}
}
