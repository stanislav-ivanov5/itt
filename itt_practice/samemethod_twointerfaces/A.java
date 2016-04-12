package samemethod_twointerfaces;

public interface A {

	default void f(){
		System.out.println("A");
	}
}
