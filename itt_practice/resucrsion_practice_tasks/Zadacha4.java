package resucrsion_practice_tasks;

/*
 * triangle of 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 */

public class Zadacha4 {

	static String row(Integer n){
		if(n == 2){
			return Integer.toString(n);
		}
		return row(n - 1) + " " + n;
	}
	
	static String triangle(int a, int b){
		if(a == b){
			return row(a);
		}
		return row(a) + "\n" + triangle(a + 1, b);
	}
	
	public static void main(String[] args) {
		System.out.println(row(6));
		System.out.println(triangle(2,15));
	}
}
