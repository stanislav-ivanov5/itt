package season4_test_practice;
// counts from a big string how many are the different letters

import java.util.Arrays;

// and tells the letters

public class Claz3 {

	public static void main(String[] args) {

		String s1 = "That's a true story about the sky and the fox and the all ather stuffs like that, just going to type in a little bit bigger string to have a normal spot for my program to work with";

		int[] letters = new int[128];
		
		System.out.println(letters.length);
		
		
		for(int index = 0; index < s1.length(); index++){
			char c = s1.charAt(index);
			if(c != ' '){
				letters[(int) c]++;
			}
		}

		System.out.println(Arrays.toString(letters));
		
		for(int index = 0; index < letters.length; index++){
			if(letters[index] > 0){
				System.out.print( "Occurence of " + (char) index + " "+  letters[index] + "\n");
			}
		}
		
	}
}
