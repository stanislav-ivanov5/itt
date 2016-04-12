package com.ampleample.swtch;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ReadingFromDisk {

	public static void main(String args[])
	throws FileNotFoundException {

	Scanner diskScanner = new Scanner(new File("rawData.txt"));
	PrintStream diskWriter = new PrintStream("cookedData.txt");
	
	double unitPrice, quantity, total;	
	unitPrice = diskScanner.nextDouble();
	quantity = diskScanner.nextInt();
	
	total = unitPrice * quantity;
	diskWriter.print("Total=");
	diskWriter.println(total);
	
	PrintStream diskWriter1 = new PrintStream("approval.txt");
	diskWriter1.print("OK pi4");
	}

}
