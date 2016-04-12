package tutorialspoint.questions.variables_types;

public class VariablesClass {

	private String name;
	private int age;
	private static int g; 

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static int getG() {
		return g;
	}
	
	public static void setG(int g) {
		VariablesClass.g = g;
	}
}
