package glava08_methods;
// fib
public class Zad08 {

	static long fib(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
	
	public static void main(String[] args) {
		// over 40 is really slow
		System.out.println(fib(50));
	}
}
