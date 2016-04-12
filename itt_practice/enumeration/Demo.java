package enumeration;

public class Demo {
	
	Category category;

	public Demo(){
		
	}
	
	public void testEnum(){
		switch (category) {
		case EURO_1:
			System.out.println("EURO_1");
			break;

		default:
			break;
		}
	}
	

}
