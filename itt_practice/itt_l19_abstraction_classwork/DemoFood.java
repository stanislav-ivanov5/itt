package lesson19_abstraction_classwork;

public class DemoFood {

	public static void main(String[] args) {
		
		Fruit f = new Fruit();
		Apple a  = new Apple();
		
		Pear p = new Pear();
		
		a.eat(a);
		p.eat(p);
		
	}
	
}
