package lesson21_inner_classes;

public class Demo {

	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();
		OuterClass.Nested nested = new OuterClass.Nested();
		oc.accessStaticClass();
	
		
		Pazar pazar = new Pazar();
		
		Pazar.Stand stand = new Pazar.Stand();
		stand.printX();
	}
}
