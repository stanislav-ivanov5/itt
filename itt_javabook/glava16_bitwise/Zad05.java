package glava16_bitwise;

public class Zad05 {

	public static void main(String[] args) {
		
		byte b = -1;

		System.out.println(b);
		
		byte a2 = 0b101;
		
		int a = (int) Math.pow(2, 17);
		
		System.out.println(a2);
		
		boolean c1 = (a2 > 1<<17) ? true : false;
		
		System.out.println(c1);
	}
}
