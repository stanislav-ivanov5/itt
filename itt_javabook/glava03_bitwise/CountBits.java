package glava03_bitwise;

// count bits which are 1 in binary representation of the number
// one solution for the wanted condition is array as well
public class CountBits {

	public static void main(String[] args) {
		
		Integer num = 8;
		int binary = 0;
		
		int power = 1;
		
		while(num > 0){
			binary = binary + (num % 2)* power;
			num /= 2;
			power *= 10;
		}
		
		System.out.println(binary);
		
		int bin = num.parseInt(num.toBinaryString(num)); 
		
		System.out.println(bin);
	}
}
