package myPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex13_1b {
	public static void main(String[] args) {
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			inputStream = new Scanner(new File("people.txt"));
			outputStream = new PrintWriter("newpeople.txt");
		} catch (FileNotFoundException e) {
			System.out.println("file open error!");
			System.exit(0);
		}
		
		while (inputStream.hasNext()) {
			String firstName = inputStream.next();
			String lastName = inputStream.next();
			outputStream.println(firstName + " " + lastName);
		}
		inputStream.close();
		outputStream.close();
	
	}
}
