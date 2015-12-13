package glava02_variables;

public class PostIncrement {

	public static void main(String[] args) {
		
		int x = 5;
		
		int y = x++;
		x = x++;
		System.out.println(x);
		System.out.println(y);
	}
}
