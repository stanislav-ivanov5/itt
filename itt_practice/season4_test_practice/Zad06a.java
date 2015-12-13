package season4_test_practice;

public class Zad06a {

	public static void main(String[] args) {
		
		int a[] = {10, 22, 43, 64, 21};
		
		for(int i = 4; i >= 0; i--){
//			System.out.println(i + " * ");
			if(a[i] > 21){
				a[i] = (a[i] + 1)% (i + 1);
				i++;
				
			}
			else {
				a[i] = a[i] * 2;
				i--;
			}
			if(i >= 0){
				System.out.println(a[i]);
			}
		}
	}
}
