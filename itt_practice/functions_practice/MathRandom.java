package functions_practice;

public class MathRandom {

	// return random num in [start..end] interval
	static int randomNum(int start, int end){
		
		int x = (int) (Math.random() * (end - start) + start);
		return x;
	}
	
	public static void main(String[] args) {
		
		System.out.println(randomNum(5, 17));
	}
}
