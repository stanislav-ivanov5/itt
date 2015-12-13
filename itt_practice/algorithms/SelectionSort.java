package algorithms;
// implementation like bubble sort
public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {64, 25, 12, 11, 22};
		int counts = 0;
		
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = i + 1; j < arr.length; j ++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					counts++;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n" + counts);
	}
}
