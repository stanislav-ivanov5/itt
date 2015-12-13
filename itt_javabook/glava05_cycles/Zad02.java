package glava05_cycles;

// odd numbers [1..40]
public class Zad02 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 40; i++){
			if(i % 2 == 0){
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
