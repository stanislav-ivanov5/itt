package glava06_arrays;

// two arrays, check if reversed first is equal the second 
public class Zad02 {

	public static void main(String[] args) {
		
		int[] arr1 = {5, 4, 3, 2, 1};
		int[] arr2 = {1, 2, 3, 4, 5};
		
		for(int i = 0; i <= arr1.length / 2; i++){
			int temp = arr1[i];
			arr1[i] = arr1[arr1.length - i - 1];
			arr1[arr1.length - i - 1] = temp; 
		}
		
		boolean isEqual = true;
		
		if(arr1.length == arr2.length){
			for(int i = 0; i < arr1.length; i++){
				if(arr1[i] != arr2[i]){
					isEqual = false;
					break;
				}
			}
		}
		
		if(isEqual){
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
	}
}
