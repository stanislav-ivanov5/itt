package algorithms;

public class SelectionSort_ {

	public static void main(String[] args) {
		
		int[] a = {13, 64, 25, 12, 11, 22, 65};
		
		int temp = 0;
		int iMax = 0;
		
		for(int i = 0; i < a.length - 1; i++){
			iMax = i;
			
			for (int j = i + 1; j < a.length; j++) {
				if(a[j] > a[iMax]){
					iMax = j;
				}
			}
			if(iMax != i){
				temp = a[i];
				a[i] = a[iMax];
				a[iMax] = temp;
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
