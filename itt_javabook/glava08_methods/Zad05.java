package glava08_methods;
// return an average from 2 numbers
public class Zad05 {

	static int getAverage(int a, int b){
		return (a + b) / 2;
	}
	
	public static void main(String[] args) {
		int avg = getAverage(5, 2);
		System.out.println(avg);
	}
}
