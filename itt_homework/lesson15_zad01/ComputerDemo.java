package lesson15_zad01;

public class ComputerDemo {

	public static void main(String[] args) {
		
		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		
		comp1.name = "comp1";
		comp1.year = 2000;
		comp1.price = 1500;
		comp1.hardDiskMemory = 250;
		comp1.freeMemory = 50;
		comp1.operationSystem = "pravetz os";
		
		comp2.name = "comp2";
		comp2.year = 2010;
		comp2.price = 1300;
		comp2.hardDiskMemory = 500;
		comp2.freeMemory = 250;
		comp2.operationSystem = "win os";
		comp2.isNotebook = true;
	
		comp1.useMemory(100);
		
		comp2.changeOperationSystem("linux");
		
		comp1.printFields();
		comp2.printFields();
	}
}
