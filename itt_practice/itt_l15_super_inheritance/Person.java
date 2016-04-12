package itt_l15_super_inheritance;

public class Person {

	private static final char MALE_CHAR = 'm';
	private static final char FEMALE_CHAR = 'f';
	private static final int MIN_AGE = 0;
	private static final int MAX_AGE = 105;
	private static final int DEFAULT_AGE = 0;
	private static final String DEFAULT_NAME = "name";
	private String name;
	private int age;
	private boolean isMale;
	
	public Person(String name, int age, boolean isMale){
		setName(name);
		setAge(age);
		this.isMale = isMale;
	}
	
	void showPersonInfo(){
		System.out.println(getName() + " " + getAge() + " " + getIsMale());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = (name != null) ? name : DEFAULT_NAME;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = (age >= MIN_AGE && age < MAX_AGE) ? age : DEFAULT_AGE;
	}
	
	public char getIsMale(){
		if(this.isMale){
			return MALE_CHAR;
		}
		return FEMALE_CHAR;
	}
}
