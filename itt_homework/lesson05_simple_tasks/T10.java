package lesson05_simple_tasks;

/*
 * Напишете програма, която намира най-често срещания елемент 
 * в масив. Пример: {4, 1, 1,4, 2, 3,4,4, 1, 2,4, 9, 3} => 4 (5 times)
 */

public class T10 {

	public static void main(String[] args) {

		int maxCount = 0;
		int count = 1;
		int element = 0;

		int[] arr = { 4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3 };

		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if(count > maxCount){
				maxCount = count;
				count = 0;
				element = arr[i];
			}
		}
		System.out.printf("Number %d, %d times", element, count);
	}
}
