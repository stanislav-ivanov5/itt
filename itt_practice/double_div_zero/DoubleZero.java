package double_div_zero;

// result : Infinity

public class DoubleZero {

	public static void main(String[] args) {
		
		double a = 5.5;
		int b = 0;
//		double b = 0.0d;
		
		double c = a / b;
		System.out.println(a / b);
	}
}
