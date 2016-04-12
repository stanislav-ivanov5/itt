package recursion;

public class RecursionTask5 {

	static int indexOfLargestElement(int a[], int index) {

		if (index == a.length - 1) {
			return index;
		}

		int maxElementIndex = indexOfLargestElement(a, index + 1);

		if (a[index] > a[maxElementIndex]) {
			return index;
		} else {
			return maxElementIndex;
		}
	}

	public static void main(String[] args) {
		System.out.println(indexOfLargestElement(new int[] { 4, 1, 9, 4, 5, 1, -1, 0, 10, 4, 2, 1, 0 }, 0));
	}
}
