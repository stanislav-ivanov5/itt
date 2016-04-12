package lesson17_inheritance;

public class Person {

	private static final int MAX_AGE = 120;
	private static final int MIN_AGE = 0;
	private static final String EMPTY_STRING = "";
	
	private String name;
	private int age;
	private boolean isMale;
	
	public Person(){
		setName(" ");
		setAge(0);
	}
	
	public Person(String name, int age, boolean isMale){
		setName(name);
		setAge(age);
		this.isMale = isMale;
	}
	
	public void showPersonInfo(){
		System.out.printf("\n Personal info: \n "
				+ "name: %s" 
				+ "\n age: %d"
				+ "\n is male: %b", getName(), getAge(), getIsMale());
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public boolean getIsMale(){
		return this.isMale;
	}
	
	public void setName(String name){
		this.name = (name != null) ? name : EMPTY_STRING ;
	}
	
	public void setAge(int age){
		this.age = (age > MIN_AGE & age < MAX_AGE) ? age : MIN_AGE;
	}
	
}
