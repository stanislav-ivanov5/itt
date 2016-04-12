package lesson23_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

// copy file
public class Demo3 {

	public static void main(String[] args) throws MyException, IOException {
		try {
			FileUtils.copyFile("C:\\file1.txt", "D:\\test\\file2.txt");
		} catch(FileNotFoundException e){
			System.out.println("File not found.");
			throw new MyException("New exception");
		}
		catch (IOException e) {
			System.out.println("File not copied.");
			e.printStackTrace();
			throw e;
		}
		throw new MyException("New exception");
	}
}
