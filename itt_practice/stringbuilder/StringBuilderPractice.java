package stringbuilder;

public class StringBuilderPractice {

	public static void main(String[] args) {
		
		String passStr = "1234";
		StringBuilder pass = new StringBuilder("123");
		pass = pass.append(passStr);
		
		String userName = "ivan";
		StringBuilder concatenated = new StringBuilder();
		
		for (int i = 0; i < passStr.length(); i++) {
			concatenated = concatenated.append(i); 
		}
		
		System.out.println(concatenated);
	}
}
