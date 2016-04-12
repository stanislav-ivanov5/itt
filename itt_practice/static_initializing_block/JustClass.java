package staticinitializingblock;

public class JustClass {

	static int staticVariable;
	
	static{
		staticVariable = 5;
		System.out.println("static initializing block in the class");
	}
	
	
	public JustClass(){
	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main");
	}
}
