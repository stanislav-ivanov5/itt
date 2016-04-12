package lesson20_zadachi_avtochasti;

public class Demo {

	public static void main(String[] args) {
		
		Engine engine = new Engine("engine", 15, 20);
		Tyre tyre = new Tyre("tyre", 5, 10);
		
		Car jazz = new Car("jazz","honda",2005);
		
		
		AutoPartsStore store = new AutoPartsStore();
		
		store.buyPart(tyre, jazz);
		
//		store.addPart(engine);
		
		store.printParts();
		
	}
}
