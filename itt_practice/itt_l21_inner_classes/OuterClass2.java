package lesson21_inner_classes;

public class OuterClass2 {

	int a = 0;
	
	void accessInner(){
		new InnerClass().b = 6;
//		InnerClass.this.b = 6;
//		OuterClass2.InnerClass.this.b = 7;
		
	}
	
	class InnerClass {
		
		int b;
		
		void accessOuter(){
			this.b = 7;
			new OuterClass2().a = 5;
		
			OuterClass2.this.a = 7;
		}
	}
}
