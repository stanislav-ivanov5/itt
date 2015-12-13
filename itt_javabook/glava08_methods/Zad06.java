package glava08_methods;

// returns array containing elements from other 2 arrays
public class Zad06 {

	static int[] extractArr(int[] a, int[] b){
		
		int[] arr = new int[a.length + b.length];
		
		for(int i = 0; i < a.length; i++){
			arr[i] = a[i];
		}
		
		for(int j = 0; j < b.length; j++ ){
			arr[a.length + j] = b[j];
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5, 5};
		int[] b = {2, 3, 2, 3};
		
		int[] newArr = extractArr(a, b);
		
		for(int i = 0; i < newArr.length; i++){
			System.out.print(newArr[i] + " ");
		}
		
	}
}
