package itt_l15_super_inheritance;

public class Student extends Person {

	private static final int MIN_SCORE = 2;
	private static final int MAX_SCORE = 6;
	private static final int DEFAULT_SCORE = 2;
	private static final int DEFAULT_AGE = 0;
	private static final String DEFAULT_NAME = "name";

	private double score;
	
	public Student(String name, int age, boolean isMale, double score){
		super(name, age, isMale);
		setScore(score);
		
	}
	
	@Override
	void showPersonInfo(){
		System.out.println(getName() + " " + getAge() + " " + getIsMale() + " grade: " + getScore());
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = (score > MIN_SCORE && score < MAX_SCORE) ? score : DEFAULT_SCORE;
	}
	
	
}
