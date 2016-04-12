package lesson21_nested_classes;

public interface IMouse {

	void transmit();
	
	static Technician method(){
		return new Technician();
	}
}
