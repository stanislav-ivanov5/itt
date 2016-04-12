package lesson19_abstraction_classwork;

public class DemoEatable {

	static void eatAndPrintEatableInfo(Eatable a1){
		a1.eatMe();
		System.out.println(a1.calculatePrice(6));
	}
	
	public static void main(String[] args) {
		
		Kiwi a1 = new Kiwi();
		Banana b1 = new Banana();

		eatAndPrintEatableInfo(a1);
		eatAndPrintEatableInfo(b1);
	}
}
