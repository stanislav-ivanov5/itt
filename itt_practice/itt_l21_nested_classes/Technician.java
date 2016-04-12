package lesson21_nested_classes;

public class Technician {

	IMouse repair(){
		
		return new IMouse() {
			
			@Override
			public void transmit() {
				System.out.println("while clicking und repairing");
				
			}
		}; 
	}
}
