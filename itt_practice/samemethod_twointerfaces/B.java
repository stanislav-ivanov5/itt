package samemethod_twointerfaces;

public interface B {
	default void f(){
		System.out.println("B");
	}
}
