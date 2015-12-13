package resucrsion_practice_tasks;
/*
 * program which calculates product of 2 real number >= 2
 * only addition is allowed
 */
public class Zadacha2 {

	static long mult(int n, int m){
		if(n == 0 || m == 0 ){
			return 0;
		}
		if(n == 1 ){
			return m;
		}
		if(m == 1 ){
			return n;
		}
		if(n == 2 && m ==2){
			return n + m;
		}
		return (m + mult(n - 1, m));
	}
	
	public static void main(String[] args) {
		
		System.out.println(mult(4,1));
		
	}
}
