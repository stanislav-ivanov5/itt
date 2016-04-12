package tutorialspoint.questions.variables_types;

public class VariablesClassDemo {

	public static void main(String[] args) {

		VariablesClass cl = new VariablesClass();

		cl.setAge(5);
		int a = cl.getAge();

		methodPrint(a);

		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
	}

	private static void methodPrint(int a) {
		System.out.println(a);
		VariablesClass.setG(8);
		System.out.println(VariablesClass.getG());
	}

	
	
}
