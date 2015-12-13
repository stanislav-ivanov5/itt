package lesson15_zad01;

public class Computer {

	short year;
	float price;
	boolean isNotebook;
	float hardDiskMemory;
	float freeMemory;
	String operationSystem;
	String name;
	
	void changeOperationSystem(String newOperationSystem){
		this.operationSystem = newOperationSystem;
	}
	
	void useMemory(float usedMemory){
		if(usedMemory < this.freeMemory){
			this.freeMemory -= usedMemory;
		}
		else {
			System.out.println("Not enough free memory for " + this.name);
		}
	}
	
	void printFields(){
		System.out.println(this.name);
		System.out.println("Year: " + this.year);
		System.out.println("Price: " + this.price);
		System.out.println("isNotebook: " + this.isNotebook);
		System.out.println("HDD memory: " + this.hardDiskMemory);
		System.out.println("Free memory: " + this.freeMemory);
		System.out.println("OS: " + this.operationSystem + "\n");
	}
	
	
}
