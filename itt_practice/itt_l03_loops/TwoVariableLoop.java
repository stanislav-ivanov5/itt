package lesson03_itt;

public class TwoVariableLoop {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1, j = 100; i <= j; i++){
			System.out.println(i + " " + j);
			if(i > 51 && i < 74){
				continue;
			}	
			sum += i;	
		}
	}
}
