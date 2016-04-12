package itt_l16_constructors;

public class C extends B {

	int b;
	
	public C(){
		super.b = 5;
		System.out.println("calling c constructor ");
		System.out.println(b);
		System.out.println(super.b);
	}
	
	@Override
	void callB(){
		super.callB();
		System.out.println("call b from c class");
	}
}
