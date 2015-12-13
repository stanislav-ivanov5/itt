package lesson04;

/**
 * Да се състави програма, чрез която предварително въведени 10 
 * реални числа от интервала се обработват по следния начин: 
 * 1. Извежда съществуващите числа.
 * 2. Всички елементи със стойност по-малки от -0.231 се заменят със 
 * сумата от квадрата на индекса им + числото 41.25, а всички останали 
 * елементи се заменят с произведението между самия елемент и 
 * неговият пореден номер
 * 3. Да се изведат елементите от началния и новообразувания масив.
 * 4. Да се изведат средната стойност на всички елементи от новата 
 * редица, които са различни от 0.
 * Пример: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
 * Изход: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25
 *
 */

public class Zadacha16 {

	
	public static void main(String[] args) {
		
		// initialize array
		double[] arr = new double[]{ -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4};
	
		// print array elements
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		// new break
		System.out.println("\n *******");
		
		
		// calculate new elements for array
		for(int i = 0; i < arr.length - 1; i++){
			boolean lessThanNum = arr[i] < -0.231;
			arr[i] = (lessThanNum) ? (i*i + 41.25) : (arr[i]*(i+1));
		}
		
		// print array's new elements
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		// find sum of array elements
		double result = 0.0d;
		for(int i = 0; i< arr.length; i++){
			result += arr[i];
		}
		
		// initialize average variable and variable for count non-zero elements
		double avg = 0.0d;
		int numsCounts = 0;

		for(int i = 0; i < arr.length; i++){
			if(arr[i] != 0 ){
				numsCounts++;
			}
		}
		
		// new break
		System.out.println("\n *******");
		
		// print average 
		avg = result / numsCounts;
		System.out.println(avg); 
		
	} 
}
