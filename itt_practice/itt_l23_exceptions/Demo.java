package lesson23_exceptions;

import java.util.ArrayList;

public class Demo {

	
	static void printArrayInfo(int[] array){
		
//		try {
			System.out.println(array.length);
			System.out.println(array[2]);
			System.out.println("some text.");
//			
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		} catch (ArrayIndexOutOfBoundsException e){
//			e.printStackTrace();
//		}
	}
	
	
	static void crashMethod(int[] array){
		try {
			printArrayInfo(array);
			
		} catch (NullPointerException e) {
			System.out.println("crash method, npe");
		}
		System.out.println("in the crash method");
	}
	
	public static void main(String[] args) throws NullPointerException, MyException {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(null);
		list.add(4);
		
		System.out.println(list.toString() + "\t" + list.get(0));
		
		int[] array = {0, 1};
		array = null;
		
		crashMethod(array);
		
		Person jean = new Person();
		Person john = new Person("john");
		
		NullPointerException e = new NullPointerException();
//		throw new MyException("my exception message", e);

//		UNREACHABLE CODE
//		System.out.println(jean.hasTheSameName(john));
		
	}
}
