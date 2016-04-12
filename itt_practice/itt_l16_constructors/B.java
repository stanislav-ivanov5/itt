package itt_l16_constructors;

public class B extends A {
	
	int b;
	
	public B(){System.out.println("b default constructor");}
	
	public B(int a){
		System.out.println("calling b constructor ");
	}
	
	void callB(){
		System.out.println("calling b method");
	}
}
