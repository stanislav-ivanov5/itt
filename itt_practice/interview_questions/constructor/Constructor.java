package tutorialspoint.questions.constructor;

public class Constructor {

	protected static String name;
	private static int id;
	
	
	
	public Constructor(String name) {
		Constructor.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		Constructor.id = id;
	}
}
