package lesson17_inheritance;

public class Employee extends Person {

	private static final int WORKING_HOURS = 8;
	private static final double OVERTIME_FACTOR = 1.5;
	private static final int MIN_DAY_SALARY = 0;
	private static final int MIN_OVERTIME_BONUS = 0;
	private static final int LAWFUL_AGE = 18;
	
	private double daySalary;
	private double overtimeWagePerHour;
	private double overtimeBonus;
	
	public Employee(String name, int age, boolean isMale, int daySalary){
		super(name, age, isMale);
		setDaySalary(daySalary);
	}
	
	@Override
	public void showPersonInfo(){
		System.out.printf("\n Employee info: \n "
				+ "name: %s" 
				+ "\n age: %d"
				+ "\n is male: %b"
				+ "\n salary: %f"
				+ "\n overtime: %f", getName(), getAge(), getIsMale(), getDaySalary(), this.overtimeBonus );
	}
	
	@Override
	public String toString(){
		return this.getName();
	}
	
	public void showEmployeeInfo(){
		this.showPersonInfo();
	}
	
	public double calculateOvertime(double hours){
		setOvertimeWagePerHour();
		this.overtimeBonus = this.getOvertimeWagePerHour() * hours;
		
		return (this.getAge() >= LAWFUL_AGE) ? 
				( this.overtimeBonus ) : MIN_OVERTIME_BONUS ;
	}
	
	public double getOvertimeWagePerHour(){
		return this.overtimeWagePerHour;
	}
	
	public void setOvertimeWagePerHour(){
		this.overtimeWagePerHour = ( this.getDaySalary() / WORKING_HOURS ) * OVERTIME_FACTOR;		
	}
	
	public double getDaySalary(){
		return this.daySalary;
	}
	
	public void setDaySalary(double daySalary){
		this.daySalary = (daySalary >= MIN_DAY_SALARY) ? daySalary : MIN_DAY_SALARY;
	}
}
