package glava03_bitwise;

// from 231 to 772
public class Bitwise {

	public static void main(String[] args) {
		
		Integer numOne = 231;
		Integer numTwo = 772;
		
		System.out.println(numOne.toBinaryString(numOne));
		System.out.println(numOne.toBinaryString(numTwo));
		
		numOne = numOne << 2;
		System.out.println("************");
		System.out.println(numOne.toBinaryString(numOne));
		
		numOne = numOne ^ 0b0010011000;
		System.out.println("************");
		System.out.println(numOne.toBinaryString(numOne));
	}
}
