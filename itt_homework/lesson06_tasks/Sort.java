package lesson06_tasks;

/**
 * Да се изведе к-тия най-голям елемент от масив
 *
 */
public class Sort {

	public static void main(String[] args) {
		
		int[] arr = new int[] {5, 1, 0, -5, 15};
		
		int k = 0;
		int counter = k;
		int temp = 0;
		int i = 0, j = 0;
		
		// minimum value is arr[0] == arr[j]
		// array sort
		for(i = 0; i < arr.length; i++){
			for(j = 0; j < arr.length - 1; j++){
				if(arr[j] > arr[i]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		System.out.print(arr[0] + " ");
		System.out.print(arr[1] + " ");
		System.out.print(arr[2] + " ");
		System.out.print(arr[3] + " ");
		System.out.print(arr[4] + " ");
	}
}
