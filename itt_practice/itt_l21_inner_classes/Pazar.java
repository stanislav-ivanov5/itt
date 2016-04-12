package lesson21_inner_classes;

public class Pazar {

	private int a = 4;
	
	int x = 4;
	
	void pazarMethod(){
		System.out.println(new Pazar.InnerStand().c);
	}
	
	class InnerStand{
		private final int c = 5;
		
		void innerMethod(){
//			c = 6;
		}
	}
	
	static class Stand{
		
		private int x = 5;
		
		void method(){
			this.x = 6;
//			Pazar.this.a = 5;
		}
		
		void printX(){
			method();
			System.out.println(Pazar.Stand.this.x);
		}
	}
}
