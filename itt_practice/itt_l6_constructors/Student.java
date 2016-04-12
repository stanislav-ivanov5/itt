package itt_l6_constructors;

public class Student {

	private static final int MIN_APPLICABLE_AGE_SHCOLARSHIP = 30;
	private static final double MIN_MONEY_SCHOLARSHIP = 0.0;
	private static final double DEFAULT_MONEY_SCHOLARSHIP = 0.0;
	private static final int DEFAULT_AGE = 18;
	private static final int MIN_AGE = 18;
	private static final int MAX_AGE = 30;
	private static final int MAX_YEARS_IN_COLLEGE = 4;
	private static final int MIN_YEARS_IN_COLLEGE = 0;
	private static final int DEFAULT_YEARS_IN_COLLEGE = 0;
	private static final int MAX_GRADE = 6;
	private static final int MIN_GRADE = 0;
	private static final int DEFAULT_GRADE = 0;
	private static final String DEFAULT_SUBJECT = "subject";
	private static final String DEFAULT_NAME = "name";
	
	private String name;
	private String subject;
	private double grade;
	private int yearsInCollege;
	private int age;
	private boolean hasDegree;
	private double moneyScholarship;
	
	public Student(){
		setGrade(4.0);
		setYearsInCollege(1);
		setHasDegree(false);
		setMoneyScholarship(0);
	}
	
	public Student(double grade, int yearsInCollege, boolean hasDegree, double moneyScholarship){
		this();
		setGrade(grade);
		setYearsInCollege(yearsInCollege);
		setHasDegree(hasDegree);
		setMoneyScholarship(moneyScholarship);
	}
	
	void upYear(){
		if (!this.hasDegree){
			setYearsInCollege(this.getYearsInCollege() + 1);
			if(this.getYearsInCollege() == MAX_YEARS_IN_COLLEGE){
				setHasDegree(true);
			}
		}
	}
	
	public double receiveScholarship(double min, double amount){
		if(this.getGrade() >= min && this.getAge() < MIN_APPLICABLE_AGE_SHCOLARSHIP){
			this.setMoneyScholarship(this.getMoneyScholarship() + amount);
		}
		return this.getMoneyScholarship();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = (name != null) ? name : DEFAULT_NAME;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject =  (subject != null) ? subject : DEFAULT_SUBJECT;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = (grade >= MIN_GRADE && grade <= MAX_GRADE) ? grade : DEFAULT_GRADE;
	}
	public int getYearsInCollege() {
		return yearsInCollege;
	}
	public void setYearsInCollege(int yearsInCollege) {
		this.yearsInCollege = (yearsInCollege > MIN_YEARS_IN_COLLEGE && yearsInCollege < MAX_YEARS_IN_COLLEGE) ? 
				yearsInCollege : DEFAULT_YEARS_IN_COLLEGE;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = (age >= MIN_AGE && age < MAX_AGE) ? age : DEFAULT_AGE;
	}
	public boolean isHasDegree() {
		return hasDegree;
	}
	public void setHasDegree(boolean hasDegree) {
		this.hasDegree = hasDegree;
	}
	public double getMoneyScholarship() {
		return moneyScholarship;
	}
	public void setMoneyScholarship(double moneyScholarship) {
		this.moneyScholarship = (moneyScholarship >= MIN_MONEY_SCHOLARSHIP) ? 
				moneyScholarship : DEFAULT_MONEY_SCHOLARSHIP;
	}
}
