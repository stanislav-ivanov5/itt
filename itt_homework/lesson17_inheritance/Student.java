package lesson17_inheritance;

public class Student extends Person{

	private static final int DEFAULT_SCORE = 0;
	private static final int MIN_SCORE = 2;
	private static final int MAX_SCORE = 6;
	
	private float score;
	
	public Student(){
		super();
	}
	
	public Student(String name, int age, boolean isMale, float score){
		super(name, age, isMale);
		setScore(score);
	}
	
	@Override
	public void showPersonInfo(){
		System.out.printf("\n Student info: \n "
				+ "name: %s" 
				+ "\n age: %d"
				+ "\n is male: %b"
				+ "\n score: %f", getName(), getAge(), getIsMale(),  getScore());
	}
	
	public void showStudentInfo(){
		this.showPersonInfo();
	}
	
	public float getScore(){
		return this.score;
	}
	
	public void setScore(float score){
		this.score = (score >= MIN_SCORE & score <= MAX_SCORE ) ? score : DEFAULT_SCORE;
	}
}
