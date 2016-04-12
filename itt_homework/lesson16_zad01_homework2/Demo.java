package lesson16_zad01_homework2;

/**
 * 
 * @author Stanislav Ivanov
 * 
 * Demo class testing adding task functionality 
 *
 */
public class Demo {
	
	public static void main(String[] args) {
		
		Employee peter = new Employee("Peter");
		
		Task homework = new Task("homework", 5);
		
		peter.setCurrentTask(homework);
		
		peter.setHoursLeft(8);
		
		peter.work();
		peter.showReport();
	}
}
