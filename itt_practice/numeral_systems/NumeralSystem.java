package numeral_systems;

public class NumeralSystem {

	public static void main(String[] args){
		
		Integer x = 28;
		int xBin = 0b101;
		int xHex = 0x1c;
		int xOct = 034;
		
		System.out.println(x);
		System.out.println(xBin);
		System.out.println(xHex);
		System.out.println(xOct);
		
		System.out.println(Integer.toBinaryString(x));
		
		System.out.println(Integer.toString(x, 8));
		
		System.out.println(Integer.parseInt("101", 2));
	}
}
