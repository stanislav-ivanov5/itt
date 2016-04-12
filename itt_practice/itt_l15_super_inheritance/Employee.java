package itt_l15_super_inheritance;

public class Employee extends Person  {

	private static final int ZERO_HOURS = 0;
	private static final double OVERTIME_COEF = 1.5;
	private static final int MIN_LEGAL_AGE = 18;
	private static final int MIN_WAGE = 0;
	private static final int DEFAULT_WAGE = 0;
	private double overtimeMoney;
	
	private int dailyWage;
	
	public Employee(String name, int age, boolean isMale, int dailyWage){
		super(name, age, isMale);
		setDailyWage(dailyWage);
	}
	
	public double calculateOvertime(double hours){
		if(this.getAge() < MIN_LEGAL_AGE){
			this.overtimeMoney = 0;
		}
		
		overtimeMoney = (hours > ZERO_HOURS) ? (hours * OVERTIME_COEF) : overtimeMoney;
		return overtimeMoney;
	}
	
	@Override
	void showPersonInfo(){
		System.out.println("name: " + getName() + " age: " + getAge() + " " + getIsMale() + 
				" overtime: " + this.getOvertimeMoney());
	}
	
	public double getOvertimeMoney(){
		return this.overtimeMoney;
	}

	public double getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(int dailyWage) {
		this.dailyWage = (dailyWage > MIN_WAGE) ? dailyWage : DEFAULT_WAGE;
	}
}
