package lesson25_threads_war_peace;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** 
 * 
 * @author stanislav5
 * ReadStringFromFile class
 * - implements static utility method readText()
 */
public class ReadStringFromFile {

	static StringBuilder readText(String fileLocation) throws FileNotFoundException {
		if(fileLocation != null){
			Scanner sc = new Scanner(new File(fileLocation));
			StringBuilder sb = new StringBuilder();
			
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				sb.append(line);
				sb.append("\n");
			}
			
			sc.close();
			return sb;
		}
		return null;
	}
}
