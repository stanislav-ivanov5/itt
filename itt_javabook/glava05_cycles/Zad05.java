package glava05_cycles;

// 11 12 13 14 15
// 21 22 23 24 25
// 31 32 33 34 35
// 41 42 43 44 45
// 51 52 53 54 55
public class Zad05 {

	public static void main(String[] args) {
		
		int p = 5;
		int q = 5;
		
		int n = 11;
		
		for(int i = 1; i <= p; i++){
			for(int j = 1; j <= q; j++){
				System.out.print(n + " ");
				n++;
			}
			n += 5;
			System.out.println();
		}
	}
}
