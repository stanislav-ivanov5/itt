package oraclenestedclasses;

public class OuterClass {

	public static String name;
	public int age;
	public long bankAccount;
	
	// nested class
	static class StaticNestedClass{
		public static void main(String[] args) {
			
		name = "";
		}
	}
	
	// non-static nested class (inner classes)
	class InnerClass{
		static final int integgger = 5;
		int age; 
		public void main3(String[] args) {
//			this.age = 5;
			
		}
	}
	
	
}
