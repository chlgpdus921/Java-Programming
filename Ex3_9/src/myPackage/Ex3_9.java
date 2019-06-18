package myPackage;

import java.util.Scanner;

public class Ex3_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0, q = 0;
		while (true) {
			System.out.print("Enter a word: ");
			String line = sc.nextLine();
			if (line.equalsIgnoreCase("quit")) {
				break;
			}
			String result = (line.substring(1, line.length()) + line.charAt(0));
			int temp_size = result.length() - 1;
			while (temp_size >= 0) {
				String temp = result.charAt(temp_size) + "";
				temp_size--;
				if (temp.equalsIgnoreCase(line.charAt(q) + "")) {
					cnt++;
				}
				q++;
			}
			if (cnt == line.length())
				System.out.println("True");
			else
				System.out.println("False");
			cnt = 0;
			q = 0;
		}
		sc.close();
	}

}