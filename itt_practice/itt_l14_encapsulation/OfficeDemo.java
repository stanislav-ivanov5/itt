package itt_l14_encapsulation;

public class OfficeDemo {

	public static void main(String[] args) {
		
		Task t1 = new Task();
		Employee emp = new Employee("ivan");
		
		emp.setCurrentTask(t1);
		t1.setEmployee(emp);
		
		t1.setWorkingHours(5.0);
		emp.setHoursLeft(8.0);
		
		emp.work();
	}
}
