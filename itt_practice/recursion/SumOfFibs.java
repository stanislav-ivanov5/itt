package recursion;

public class SumOfFibs {

	static long sum(int n){
		if(n == 0){
			return 1;
		}
		if(n == 1){
			return 2;
		}
		return sum(n - 1) + fib(n);
	}
	
	static long fib(int n){
		if(n == 0){
			return 1;
		}
		if(n == 1){
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(fib(4));
		System.out.println(sum(2));
	}
}
