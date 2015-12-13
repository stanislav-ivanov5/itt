package fibonacci_iteration;

public class FibIteration {

	static long fibo(int n) {
		if (n <= 1) {
			return n;
		}
		int fibo = 1;
		int fiboPrev = 1;
		for (int i = 2; i < n; ++i) {
			int temp = fibo;
			fibo += fiboPrev;
			fiboPrev = temp;
		}
		return fibo;
	}

	public static void main(String[] args) {
		System.out.println(fibo(200000));
	}
}
