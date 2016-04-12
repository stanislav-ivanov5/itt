package softacadClassesPractice;

public class CarDemo {

	public static void main(String[] args) {
		
		Car pejo = new Car();
		Car jazz = new Car();
		
		pejo.color = "gray";
		pejo.currentGear = 3; 
		pejo.currentSpeed = 50;
		pejo.maxSpeed = 250;
		
		jazz.color = "light blue";
		jazz.currentGear = 5;
		jazz.currentSpeed = 50;
		jazz.maxSpeed = 115;
		
		Person me = new Person();
		pejo.owner = me;
		
		me.name = "stan";
		me.age = 27;
		
		System.out.println(me.name + " " + pejo.owner.age);
		
		pejo.changeColor("black");
		
	}
}
