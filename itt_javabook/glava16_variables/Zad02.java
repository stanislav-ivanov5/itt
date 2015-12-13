package glava16_variables;

/// swap 3 numbers values with array helper
import java.util.Arrays;

public class Zad02 {

	public static void main(String[] args) {

		int a = 4, b = 7, c = 12;

		System.out.println(Arrays.toString(swap(a, b, c)));
	}

	static int[] swap(int x, int y, int z) {
		int arr[] = new int[3];

		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		int tmp;
		tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = tmp;

		return arr;
	}
}
