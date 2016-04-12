package lesson21_inner_classes;

public class OuterClass {

	int a = 0;
	
	public OuterClass(){
		System.out.println("say out");
	}
	
	void accessStaticClass(){
		Nested.printWhereAreYou();
		Nested.x = 5;
		
//		Nested.this.x = 5;
		
	}
	
	void method(){
		
	}
	
	static class Nested {
	
		static int x; 
		
		
		public Nested(){
			
			printWhereAreYou();
		}
		
		static void printWhereAreYou(){
			System.out.println("say in");
			
//			OuterClass.this.a = 6;
		}
		
		void accessOuterClass(){
			Nested.x = 5;
			new OuterClass().a = 5;
		}
	}
	
	
}
