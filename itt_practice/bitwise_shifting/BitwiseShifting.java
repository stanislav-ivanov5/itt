package bitwise_shifting;

public class BitwiseShifting {

	public static void main(String[] args) {

		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toBinaryString(2 << 11));

		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(2 ^ 1));

		System.out.println();
		System.out.println();

		System.out.println(Integer.toBinaryString(5));
		System.out.println(~5);
		System.out.println(Integer.toBinaryString(~5));
		System.out.println(Integer.toBinaryString(6));
		System.out.println(Integer.toBinaryString(-6));

		System.out.println(Integer.toBinaryString(0));
		System.out.println(Integer.toBinaryString(~0));
		System.out.println(Integer.toBinaryString(-1));

		System.out.println("\n ***************");
		int x = 0b10000000000000000000000000000001;
		int xOneRight = x >> 1;
		int xOneLeft = x << 1;
		System.out.println("Original number");
		System.out.println(Integer.toBinaryString(x));
		System.out.println("Shifted rignt by 1");
		System.out.println(Integer.toBinaryString(xOneRight));
		System.out.println("Shifted left by 1");
		System.out.println(Integer.toBinaryString(xOneLeft));
		int xTwoRight = x >> 2;
		int xTwoLeft = x << 2;
		System.out.println("Shifted rignt by 2");
		System.out.println(Integer.toBinaryString(xTwoRight));
		System.out.println("Shifted left by 2");
		System.out.println(Integer.toBinaryString(xTwoLeft));
	}
}
