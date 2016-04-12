package samemethod_twointerfaces;

public class C implements A, B{

//	@Override
//	public void f() {
//		
//		
//	}

	public static void main(String[] args) {
		
		C c = new C();
		c.f();
	}

	@Override
	public void f() {
		B.super.f();
		System.out.println("C");
		
	}
}
