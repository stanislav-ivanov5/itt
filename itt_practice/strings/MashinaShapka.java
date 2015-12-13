package strings;

/*
 * mashina, shapka
 */

public class MashinaShapka {

	public static void main(String[] args) {
		
		String s1 = "masina";
		String s2 = "shapka";
		
		int where = 0;
		for(int i = 0; i < s1.length(); i++){
				if(s1.charAt(i) == (s2.charAt(0))){
					where = i;
					break;
				}
		}
		
		System.out.println(where);
		
		for(int i = 0; i < s1.length(); i++){
			System.out.print(s1.charAt(i));
			if(i == where){
				for(int j = 1; j < s2.length(); j++){
					System.out.print(s2.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
