package lesson08;

public class Zadacha5_exercise {

	public static void main(String[] args) {

		// initialize two strings
		String str1 = "pink";
		String str2 = "omit";

		// initialize char array with length of each string
		char[][] arr = new char[str1.length()][str2.length()];

		// 
		int crossingPointX = 2;
		int crossingPointY = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (j == crossingPointX) {
					arr[i][j] = str1.charAt(i);
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == crossingPointY) {
					arr[i][j] = str2.charAt(j);
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == 0){
					arr[i][j] = '-';
				}
				System.out.print(arr[i][j]);										
			}
			System.out.println();
		}
	}
}
