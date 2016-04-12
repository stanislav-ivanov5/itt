package lesson19_task_employee;

public class Task {

	private static final int MAX_WORK_HOURS = 12;
	protected static final int MIN_WORK_HOURS = 0;
	protected static final int DEFAULT_WORK_HOURS = 0;
	protected static final String DEFAULT_NAME = "name";
	
	private String name;
	private int workingHours;
	
	public Task(String name, int workingHours){
		setName(name);
		setWorkHours(workingHours);
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = (name != null) ? name : DEFAULT_NAME;
	}
	
	public int getWorkHours(){
		return this.workingHours;
	}
	
	public void setWorkHours(int workingHours){
		this.workingHours = (workingHours >= MIN_WORK_HOURS && workingHours <= MAX_WORK_HOURS) ? 
				workingHours : DEFAULT_WORK_HOURS;
	}
}
