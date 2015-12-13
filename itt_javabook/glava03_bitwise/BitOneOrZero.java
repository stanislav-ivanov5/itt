package glava03_bitwise;

// check whether the fifth bit of a number is 1 or 0
public class BitOneOrZero {

	public static void main(String[] args) {
		
		int num = 15;
		int temp = num;
		int digits = 0;
		
		while(temp > 0){
			temp /= 2;
			digits++;
		}
		
		System.out.println(digits);
		
		int binary = 0;
		int power = 1;
		
		while(num > 0){
			binary = binary + (num % 2)*power;
			num /= 2;
			power *= 10;
		}
		
		System.out.println(binary);
		
		int counts = 0;
		boolean isOne = false; 
		
		for (int i = 0; i < 4; i++) {
			if(i == 3 && binary % 10 == 1){
				isOne = true;
				break;
			}
			binary /= 10;
		}
		
		System.out.println(isOne);
		
		while(binary > 0 ){
			int mod = binary % 10;
			binary /= 10;
			if(mod == 1){
				counts++;
			}
			
		}
		
		System.out.println(counts);
	}
}
