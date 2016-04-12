package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDemo {

	public static void main(String[] args) {
		File file = new File("E:\\Workspace\\testing.txt");
		File file2 = new File("E:\\Workspace\\testing2.txt");
		
		try {
			file.createNewFile();
			file2.createNewFile();
			
			FileInputStream input = new FileInputStream(file);
			int b = 0;
			
			FileOutputStream output = new FileOutputStream(file2);
			output.write('c');
			output.write('c');
			
			output.write('t');
			output.close();

			
			input.close();
		} catch (IOException e) {
			System.out.println("Can't create new file");
		}
	}
}
