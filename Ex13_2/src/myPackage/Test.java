package myPackage;

import java.util.*;
import java.io.*;

public class Test {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int line, i = 0;
		int[] temp = new int[20];
		
		String in = "a.txt";
		String out = "b.txt";
		Scanner input = null;
		PrintWriter output = null;
		
		try {
			input = new Scanner(new File(in));
			while (input.hasNextInt()) {
				line = input.nextInt();
				temp[i] = line;
				i++;
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error!");
			System.exit(0);
		}
		
		try {
			output = new PrintWriter(out);
			for (i = 0; i < 10; i++) {
				int code = -1;
				for (int j = 0; j < 10; j++) {
					if (temp[i] == temp[j]) {
						code = j;
						System.out.println("The i: " + i);
						System.out.println("Second array: " + code);
						break;
					}
				}
				System.out.println("Real i: " + i);
				if (code == i) {
					System.out.println("Code array: " + code);
					output.println(temp[i]);
					continue;
				}
			}
			output.close();
		} catch(FileNotFoundException e) {
			System.out.println("Error");
			System.exit(0);
		}
	}
}
