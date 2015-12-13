package glava16_bitwise;
// convert 6 in decimal to 4 in decimal with bitwise operators
public class Zad01 {

	public static void main(String[] args) {
		
		int a = 6;
		int c = 2;
		
		Integer b = a ^ c;
		
		System.out.println(Integer.toBinaryString(b));
	}
}
