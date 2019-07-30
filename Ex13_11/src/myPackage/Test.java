package myPackage;

import java.io.*;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String in = "words.txt";
		String out = "output.txt";
		Scanner input = null;
		PrintWriter output = null;
		
		String line;
		boolean detect;
		
		try {
			input = new Scanner(new File(in));
		} catch(FileNotFoundException e) {
			System.out.println("Error opening the file" + in);
			System.exit(0);
		}
		
		try {
			output = new PrintWriter(out);
		} catch(FileNotFoundException e) {
			System.out.println("Error opening the file" + out);
			System.exit(0);
		}
		
		while (input.hasNextLine()) {
			line = input.nextLine();
			detect = line.endsWith("dous");
			if (detect)
				output.println(line);
		}
		
		output.close();
		input.close();
	}
}
