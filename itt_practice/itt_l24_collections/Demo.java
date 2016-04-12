package lesson24_collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {

		String text = "Note that the code always refers to "
				+ "the Collection by its interface type (Set) rather "
				+ "than by its implementation type. This is a strongly "
				+ "recommended programming practice because it gives you "
				+ "the flexibility to change implementations merely by changing "
				+ "the constructor. If either of the variables used to store "
				+ "a collection or the parameters used to pass it around are declared "
				+ "to be of the Collection's implementation type rather than its "
				+ "interface type, all such variables and parameters must be changed "
				+ "in order to change its implementation type.";
	
		String text2 = text.replace(',', '\u0000');
		text2 = text2.replace('.', '\u0000');
		
		String[] splittedText = text2.split(" ");
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// add all words to hash map
		for (String s : splittedText) {
			
			map.put(s.hashCode(), s);
		}
		
		// add map values to a set
		Set<String> setOfString = new HashSet<String>(map.values());
		
		Iterator<String> it = setOfString.iterator();
		
		int index = 0;
		
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		System.out.println();
		
		// iterating over the set 
		// prints String array set elements 
		for (String s : setOfString) {
			if(index < splittedText.length){
				System.out.print(splittedText[index] + "\t");
			}
			System.out.println(s.toString() + "\t" + s.hashCode());
			index++;
		}
		
	}
}
