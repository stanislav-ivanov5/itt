package tutorialspoint.questions.parse_int;

public class ParseIntClass {

	public static void main(String[] args) {

		String intString = "55";

		int parsedInt = Integer.parseInt(intString);

		System.out.println(parsedInt);

		int a = parsedInt + 1;
		System.out.println(a);

		String aStr = "4";
		System.out.println("aStr " + aStr);

		StringBuffer str = new StringBuffer();
		str.append(aStr);
		System.out.println("str " + str);
		for (int i = 0; i < 5; i++) {
			str.append(" " + i);
			System.out.println("str " + str);
		}
	}
	
}
