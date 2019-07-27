package myPackage;

import java.util.Scanner;
import java.io.*;

public class ConvertTest {
	public static void main(String[] args) {
		String file = "abbreviation.txt";
		String[] line = new String[6];
		int i = 0;
		Scanner input = null;

		try {
			input = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			System.out.println("Error opening the file" + file);
			System.exit(0);
		}

		while (input.hasNextLine()) {
			line[i] = input.nextLine();
			i++;
		}
		input.close();
		String message = "message.txt";
		String l = null;
		Scanner input1 = null;

		try {
			input1 = new Scanner(new File(message));
		} catch (FileNotFoundException e) {
			System.out.println("Error opening the file" + message);
			System.exit(0);
		}
		System.out.println("Message: ");

		while (input1.hasNextLine()) {
			l = input1.nextLine();
			System.out.println(l);
		}
		input1.close();

		Convert m = new Convert();
		String str = m.bracket(l, line);
		String file1 = "newMessage.txt";
		PrintWriter outputStream = null;

		try {
			outputStream = new PrintWriter(file1);
		} catch (FileNotFoundException e) {
			System.out.println("Error opening the file" + file1);
			System.exit(0);
		}
		outputStream.println(str);
		outputStream.close();
	}
}
