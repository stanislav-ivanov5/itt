package lesson04;

/**
 * Напишете програма, която намира и извежда най-дългата редица от 
 * еднакви поредни елементи в даден масив
 *
 */

public class Zadacha8 {

	public static void main(String[] args) {
		
		int current = 0;	// current number from the iteration
		int maxCount = 0;	// using it for storing the max value of counter
		int counter = 1;	// current counter for equal digits in a sequence
		
		int digit = 0;
		
		// initialize array
		int[] arr = new int[] {1, 1, 1, 4, 5, 5, 5, 5, 5, 3, 7, 7, 7, 7};
		
		// assign first element of array to current
		current = arr[0];
		
		/*
		 * check if current element is equal to the next
		 * if yes - increment counter, 
		 * switch current with the next number in the array
		 * and if counter reaches a number > maxCount, maxCount = counter
		 * 
		 * if the current element is not equal to the next one 
		 * - reset counter and start over 
		 */
		for(int i = 1; i < arr.length; i++){
			if(current == arr[i]){
				counter++;
				current = arr[i];
				if(counter > maxCount){
					digit = arr[i]; // store the most repetitive number when counter outnumber maxCount
					maxCount = counter;
				}
			}
			else {
				counter = 1;
				current = arr[i];
			}
		}
		
		// print the sequence
		for(int i = 0; i < maxCount; i++){
			System.out.printf("%d ", digit);
		}
		
	}
}
