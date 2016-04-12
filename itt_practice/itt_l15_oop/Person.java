package itt_l15_oop;

public class Person {

	private static final String DEFAULT_PERSONAL_NUM = "1000000000";
	private static final int DEFAULT_AGE = 0;
	private static final int MAX_AGE = 130;
	private static final int MIN_AGE = 0;
	private static final String DEFAULT_NAME = "";
	private String name;
	private short age;
	private String personalNumber;
	
	public void eat(){ System.out.println( "eat" );}
	public void sleep(){ System.out.println( "sleep" );}
	public void walk(){ System.out.println( "walk" );}
	
	public short growUp(){
		setAge((short)(getAge() + 1));
		return getAge();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = (name != null) ? name : DEFAULT_NAME;
	}
	public short getAge() {
		return (short)age;
	}
	public void setAge(short age) {
		this.age = (age > MIN_AGE && age < MAX_AGE) ? age : DEFAULT_AGE;
	}
	public String getPersonalNumber() {
		return personalNumber;
	}
	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = (personalNumber != null && personalNumber.length() == 10) 
				? personalNumber : DEFAULT_PERSONAL_NUM;
	}
}
