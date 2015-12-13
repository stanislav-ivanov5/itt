package strings;

public class StringsJoin {

	public static void main(String[] args) {
		
		String[] strings = {"asdf", "qwer", "wide", "pet", "5"};
		
		String sJoin = String.join(",", strings);
		
		System.out.println(sJoin);
	}
}
