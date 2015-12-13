package algorithms;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {64, 25, 12, 11, 22};

		int count = 0;
		
		for(int i = 0; i < arr.length; i++){
//			boolean isSorted = true;
			for(int j = 0; j < arr.length; j++){
				if(arr[i] < arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
//					isSorted = false;
					count++;
				}
			}
//			if(isSorted){
//				break;
//			}
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n" + count);
	}
}
