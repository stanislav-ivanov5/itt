package lesson25_threads_war_peace;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author stanislav5
 * Partitioner class
 * - static utility method  
 */
public class Partitioner {

	static List<String> partitionText(StringBuilder sb, int numParts) {
		if (sb != null) {
			List<String> splitted = new ArrayList<String>(numParts);
			// split text by PARTS - 1 parts
			for (int index = 0; index <= numParts - 1; index++) {
				int step = sb.length() / numParts;
				int startIndex = index * step;
				int endIndex = step + startIndex;
				splitted.add(sb.substring(startIndex, endIndex));
				// substring from the last part index to the end of text 
				if (index == numParts - 1) {
					splitted.add(sb.substring(startIndex));
				}
			}
			return splitted;
		}
		return null;
	}
}
