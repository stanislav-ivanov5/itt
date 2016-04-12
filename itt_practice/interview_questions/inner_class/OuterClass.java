package inner_class;

public class OuterClass {

	protected String name;

	@SuppressWarnings("unused")
	private static int count;

	void accessFromNestedClass() {
		// compile time error, the outer class doesn't see the inner one
		 System.out.println(NestedStaticClass.age);
	}

	public static class NestedStaticClass {
		private static int age = 6;

		// compile time error, static nested classes don't see the outer class
		// fields
		public void printMemberFromOuterClass() {
//			 System.out.println(name);
		}
	}
}
