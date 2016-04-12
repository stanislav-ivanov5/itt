package itt_l14_encapsulation;

public class Task {

	private static final int MAX_HOURS = 8;
	private static final int MIN_HOURS = 0;
	private static final int DEFAULT_HOURS = 0;
	private static final String DEFAULT_NAME = "name";
	private String name;
	private double workingHours;
	private Employee employee;
	

	// constructor
	public Task(){
		setName(DEFAULT_NAME);
		setWorkingHours(DEFAULT_HOURS);
	}
	
	public Task(String name, double workingHours){
		setName(name);
		setWorkingHours(workingHours);
	}
	
	
	
	// get and set methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = (name != null) ? name : DEFAULT_NAME;
	}
	public double getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(double workingHours) {
		this.workingHours = (workingHours >= MIN_HOURS && workingHours < MAX_HOURS) 
				? workingHours : DEFAULT_HOURS;
	}
	
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = (employee != null) ? 
				employee : new Employee(Employee.DEFAULT_NAME);
	}
}
