package lesson15_teamwork;

import java.util.Arrays;
import java.util.Scanner;

public class SymbolTask {
	
	static int matrixRowLength = 0;
	
	static void encrypt(char[][] matrix, String encryptStr){
		
		char[] charsArr = splitArr(encryptStr);
		

		System.out.println(Arrays.toString(getPositionsAB(findCoordinates(matrix, charsArr[0]), 
				findCoordinates(matrix, charsArr[1]))));

		StringBuilder sb = new StringBuilder();
		
		// crawl through charsArr and get the encrypted letters
		// encrypt
		for (int i = 0; i <= charsArr.length - 2; i+=2) {
			sb.append(encryptAPair(matrix, getPositionsAB(findCoordinates(matrix, charsArr[i]), 
					findCoordinates(matrix, charsArr[i + 1]))));
			System.out.println(encryptAPair(matrix, getPositionsAB(findCoordinates(matrix, charsArr[i]), 
					findCoordinates(matrix, charsArr[i + 1]))));			
		}
		
		System.out.println(sb.toString());
		
	}
	
	// gets initial char matrix and array of int[] - coordinates of 2 elements in matrix, 
	// returns char[] array, which contains two encrypted letters
	static char[] encryptAPair(char[][] matrix, int[] posEncryptedAB){
	
		char[] encrPair = new char[2];
		
		encrPair[0] = matrix[posEncryptedAB[0]][posEncryptedAB[1]];
		encrPair[1] = matrix[posEncryptedAB[2]][posEncryptedAB[3]];
		
		return encrPair;
	}
	
	// combine coordinates of two coordinates ( of 'A' and 'B'  ) in one array and swap their columns, 
	// returns int[] array with A and B coordinates
	static int[] getPositionsAB(int[] posA, int[] posB){
		int[] posAB = new int[4];
		
		for (int indexA = 0; indexA < posA.length; indexA++) {
			posAB[indexA] = posA[indexA];
		}
		
		for (int indexB = 0; indexB < posB.length; indexB++) {
			posAB[posA.length + indexB] = posB[indexB];
		}		
		
		if(!validateXY(posAB, 0)){
			if(!validateXY(posAB, 1)){
				swapColumns(posAB);
			}			
		}
				
		
		return posAB;
	}
	
	// posAB[index] - coordinate of 'A' by axis x/rows
	// posAB[index + 2] - coordinate of 'A' by axis y/cols
	static boolean validateXY(int[] posAB, int index){
		
		int arrLength = matrixRowLength;
		
		if(index == 0){
			// if rows are equal 
			if((posAB[index] == posAB[index + 2]) && posAB[index] < (arrLength - 1) 
					&& posAB[index + 2] < (arrLength - 1)){
				++posAB[index + 1];
				++posAB[index + 3];
				if(posAB[index + 1] == arrLength ){
					posAB[index + 1] = 0;
				}
				if (posAB[index + 3] == arrLength){
					posAB[index + 3] = 0;
				}
				return true;
			}
			// if columns are equal
			if((posAB[index + 1] == posAB[index + 3]) && posAB[index] < (arrLength - 1) 
					&& posAB[index + 2] < (arrLength - 1)){
				++posAB[index];
				++posAB[index + 2];
				if(posAB[index] == arrLength){
					posAB[index] = 0;
				}
				if(posAB[index + 2] == arrLength){
					posAB[index + 2] = 0;
				}
				return true;
			}
		}
			return false;
		}
		
	// gets initial matrix of chars, and a char c to search for in the matrix,
	// returns coordinates of char c in int[] array
	static int[] findCoordinates(char[][] matrix, char c){
		// array of coordinates of 'A'
		int[] posArr = new int[2];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(c == matrix[i][j]){
					posArr[0] = i;
					posArr[1] = j;
				}
			}
		}
		return posArr;
	}

	// gets user input as String and returns a char[] array
	static char[] splitArr(String encryptStr){
		char[] charsArr = new char[encryptStr.length()];
		
		for(int i = 0; i <= encryptStr.length() - 1; i++){
			charsArr[i] = encryptStr.charAt(i);
		}
		return charsArr;
	}
	
//	static String[] splitPairs(String encryptStr) {
//		// split by 2
//		String[] pairsArr = new String[encryptStr.length() / 2];
//		
//		int j = 0;
//		for(int i = 0; i <= encryptStr.length() - 2; i += 2){
//			pairsArr[j] = encryptStr.charAt(i) + "" + encryptStr.charAt(i + 1);
//			j++;
//		}
//		return pairsArr;
//	}

	// gets an array[4] with elements positions and swap [1] and [3] (their columns)
	// positions[].length = 4
	static int[] swapColumns(int[] positions){
		int tmp;
		tmp = positions[1];
		positions[1] = positions[3];
		positions[3] = tmp;
	
		return positions;
	}
	
	// main method testing with matrix of characters, validate the input and invoke encrypt() method
	public static void main(String[] args) {

		char[][] matrix = { 
				{ 'B', 'M', 'S', 'J', 'C' }, 
				{ 'I', 'F', 'N', 'T', 'E' }, 
				{ 'R', 'L', 'A', 'H', 'K' },
				{ 'D', 'O', 'G', 'Q', 'V' }, 
				{ 'U', 'W', 'X', 'Y', 'P' }, };

		matrixRowLength = matrix.length;
		
		Scanner sc = new Scanner(System.in);
		String encryptStr = sc.nextLine();

		while (encryptStr.contains("Z") || encryptStr.contains("z")) {
			System.out.println("Bad input");
			encryptStr = sc.next();
		}

		encryptStr = encryptStr.toUpperCase();
		if (encryptStr.length() % 2 == 1) {
			encryptStr = encryptStr + "P";
		}

		System.out.println(encryptStr);
		encrypt(matrix, encryptStr);
	}
}