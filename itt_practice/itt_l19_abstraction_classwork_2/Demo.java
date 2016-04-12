package lesson19_abstraction_classwork_2;

public class Demo {
	public static void main(String[] args) {
		
		SpirtDrink kakvoMiSePie = null;
		
		if (Math.random() > 0.5) {
			kakvoMiSePie = new Vodka();
		}
		else {
			kakvoMiSePie = new Whiskey();
		}
		
		kakvoMiSePie.burn();
		kakvoMiSePie.izparqvaSe();
//		Vodka jack = new Vodka();
		
//		jack.keepSpirt();
		
		// cannot instantiate abstract class
//		SpirtDrink drink1 = new SpirtDrink();
//		drink1.burn();
//		drink1.keepSpirt();
	}
}	
