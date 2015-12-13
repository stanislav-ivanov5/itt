package algorithms;

public class SelectionSortNew {

	public static int[] selectionSort(int[] a) {
		/* a[0] to a[n-1] is the array to sort */
		int temp = 0;
		int iMax = 0;
		// advance the position through the entire array
		// (could do j < n-1 because single element is also min element)
		for (int i = 0; i < a.length - 1; i++) {
			/* find the min element in the unsorted a[j .. n-1] */
			/* assume the min is the first element */
			iMax = i;
			/* test against elements after j to find the smallest */
			for (int j = i + 1; j < a.length; j++) {
				/* if this element is less, then it is the new minimum */
				if (a[j] > a[iMax]) {
					/* found new minimum; remember its index */
					iMax = j;
				}
			}
			/*
			 * iMin is the index of the minimum element. Swap it with the
			 * current position
			 */
			System.out.println(iMax);
			if (iMax != i) {
				// swap the elements!
				temp = a[i];
				a[i] = a[iMax];
				a[iMax] = temp;
			}
		}
		return a;
	}

	public static void main(String[] args) {

		int[] ar = {13, 64, 25, 12, 11, 22, 65};;

		selectionSort(ar);
		
		for(int i = 0; i < ar.length; i++){
			System.out.print(ar[i] + " ");
		}
		
	}
}
