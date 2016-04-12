package lesson23_exceptions;

import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		int c;
		try {
			c = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			
		}
	}
}
