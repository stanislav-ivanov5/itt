package itt_l6_constructors;

public class ComputerStoreDemo {

	public static void main(String[] args) {
		
		Computer toshiba = new Computer();
		toshiba.setPrice(500);
		
		Computer lenovo = new Computer();
		lenovo.setPrice(400);
		
		String s = (String.valueOf(toshiba.comparePrice(lenovo)));
		if(s.equalsIgnoreCase("1")){
			System.out.println("greater than ");
		}
	}
}
