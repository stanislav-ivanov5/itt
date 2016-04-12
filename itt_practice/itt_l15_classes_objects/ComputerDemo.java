package itt_l15_classes_objects;

public class ComputerDemo {

	public static void main(String[] args) {
		
		Computer p1 = new Computer();
		Computer p2 = new Computer();
		
		p1.hardDiskMemory = 600;
		p1.freeMemory = 400;
		p1.useMemory(100);
		p1.changeOperationSystem("Maverick");
		
		p2.hardDiskMemory = 400;
		p2.freeMemory = 50;
		
		p2.changeOperationSystem("Android");
		
		System.out.println(p1.freeMemory + " " + p1.operationSystem);
		System.out.println(p2.freeMemory + " " + p2.operationSystem);
	}
}
