package polymorphism;

public class Cat extends Animal {

	@Override
	public void walk(){
		System.out.println("cat crowling ");
	}
	
	public void sing(){
		System.out.println("cats don't sing");
	}
	
}
