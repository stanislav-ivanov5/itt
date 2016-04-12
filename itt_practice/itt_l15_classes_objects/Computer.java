package itt_l15_classes_objects;

public class Computer {

	private static final String DEFAULT_OS = "os";
	private int year;
	private double price;
	private boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	
	
	void changeOperationSystem(String newOS){
		this.operationSystem = (newOS != null) ? newOS : DEFAULT_OS ;
	}
	
	void useMemory(double usedMemory){

		if(usedMemory >= 0 && usedMemory <= freeMemory){
			this.freeMemory -= usedMemory;
		}
		if(usedMemory > freeMemory){
			System.out.println("not enough free memory");
		}
	}
	
	
	
}
