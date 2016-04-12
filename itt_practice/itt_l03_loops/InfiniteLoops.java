package lesson03_itt;

public class InfiniteLoops {

	public static void main(String[] args) {

		int n = 6;
		do {
			System.out.println(5);
			n++;
		} while (n < 10);

		
		for(; ;){
			System.out.println(6);
		}
	}
}
