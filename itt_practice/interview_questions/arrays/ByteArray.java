package tutorialspoint.questions.arrays;

public class ByteArray {

	
	
	public static void main(String[] args) {
		
		byte a = 3;
		byte[] ba = {a, 4};
		ba.toString();
		
		toString(ba);
		
		
	}

	private static void toString(byte[] ba) {
		for(int i = 0; i < ba.length; i++) {
			System.out.print(ba[i] + " ");
		}
	}
}
