package tutorialspoint.questions.finalizer;

public class FinalizelClass {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder();
		Object obj = new Object();
		str.append('f');
		System.out.println(str);
		obj.getClass();
//		obj.finalize(); -> there is no such thing as finalize in this eclipse
	}

}
