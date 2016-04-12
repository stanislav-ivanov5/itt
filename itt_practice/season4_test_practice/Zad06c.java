package season4_test_practice;

public class Zad06c {

	static long pow(int n, int p){
		
		if(p >= 1){
			return pow(n, --p) * n;
		}
		else 
			return 1;
	}
	
	static int square(int n){
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 4;
		}
		return n*n;
	}
	
	static int cubeProd(int num){
		if(num == 1){
			return 1;
		}
		if(num == 2){
			return 8;
		}
		return square(num)*num;
	}
	
	static int cub(int n){
		if(n == 1){
			return 1;
		}
		return cub(n) / n;
	}
	
	public static void main(String[] args) {

		System.out.println(pow(5, 3));
		System.out.println(square(9));
		System.out.println(cubeProd(9));
		
		System.out.println(cub(9));
	}
}
