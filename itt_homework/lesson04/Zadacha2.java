package lesson04;

/**
 * Нека по въведен масив да се конструира нов, като половината му
 * елементи са точно като на оригиналния, а другите да са тези 
 * елементи, но в обратен ред. Последно, да се изведе новия масив 
 * на екрана
 * 
 */

public class Zadacha2 {

	public static void main(String[] args) {
		
		// initialize first array
		int[] oldArr = {5, 7, 8, -9};
		
		/* check if length of first array is divisible by 2
		 * and initialize new array with proper length
		 */
		
		if(oldArr.length % 2 == 0){
			int[] newArr = new int[oldArr.length];			

			// assign values for the first half of newArray
			for(int i = 0; i < newArr.length / 2; i++){
				newArr[i] = oldArr[i];
			}

			// assign the values from first half to the second half of the array
			for(int i = (newArr.length / 2 ); i < newArr.length; i++){
				newArr[i] = newArr[newArr.length - i - 1];
			}
			
			// print new array values 
			for(int i = 0; i < newArr.length; i++){
				System.out.print(newArr[i] + " ");
			}
		}
		if(oldArr.length % 2 == 1){
			int[] newArr = new int[oldArr.length - 1];
			
			for(int i = 0; i < newArr.length / 2; i++){
				newArr[i] = oldArr[i];
			}
			
			for(int i = (newArr.length / 2 ); i < newArr.length; i++){
				newArr[i] = oldArr[newArr.length - i - 1];
			}

			for(int i = 0; i < newArr.length; i++){
				System.out.print(newArr[i] + " ");
			}
		}
		
	}
}
		/* there is another case where newArray has 
		 * length = oldArr + 1 
		 * in case we duplicate the median value of the first given array 
		*/
		
		
