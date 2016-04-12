package polymorphism;

public class DoItClass {

	static public void doIt(String s){
		System.out.println("string");
	}
	
	static public void doIt(Object o){
		System.out.println("object");
	}
	
	public static void main(String[] args) {
		
		String arg = "5";
		doIt((Object)arg);
		doIt(arg);
	}
	
}
