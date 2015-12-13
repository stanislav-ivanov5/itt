package glava16_variables;

public class Zad01 {

	public static void main(String[] args) {

		int a = 5;
		int b = 6;

		System.out.println("Sum = " + sum(a, b));
		System.out.println("Sub = " + sub(a, b));
		System.out.println("Mult = " + mult(a, b));
		System.out.println("Div = " + div(a, b));
		System.out.println("Mod = " + mod(a, b));
	}

	static int sum(int x, int y) {
		return x + y;
	}

	static int sub(int x, int y) {
		return x - y;
	}

	static int mult(int x, int y) {
		return x * y;
	}

	static int div(int x, int y) {
		if (y == 0) {
			return -1;
		}
		return x / y;
	}

	static int mod(int x, int y) {
		if (y == 0) {
			return -1;
		}
		return x % y;
	}
}
