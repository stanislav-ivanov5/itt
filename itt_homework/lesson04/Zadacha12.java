package lesson04;

/**
 * Да се състави програма, чрез която по предварително въведени 7  
 * числа  в едномерен масив се разменят местата на елементи с индекси:
 * - 0 и 1 чрез трета променлива;
 * - 2 и 3 чрез събиране;
 * - 4 и 5 чрез умножение.
 * Пример: 1,2,3,4,5,6,7
 * Изход: 2,1,4,3,6,5,7
 *
 */

public class Zadacha12 {

	public static void main(String[] args) {
		
		// initialize array
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
		
		int temp;
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		// switch values of arr[0] and arr[1]
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		// switch values of arr[2] and arr[3]
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
	
		System.out.println();
		
		// switch values of arr[4] and arr[5]
		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
