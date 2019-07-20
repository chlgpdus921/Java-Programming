package myPackage;

import java.util.Scanner;

public class Ex12_1c {
	public static int count = 0;

	public static String countDigits(String s) {
		int size = s.length();
		if (size > 0) {
			char tmp = s.charAt(size - 1);
			if (tmp > 47 && tmp <= 57) {
				count++;
			}
			return countDigits(s.substring(0, size - 1));
		} else
			return "";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		countDigits(s);
		System.out.println("Digit count: " + count);
		sc.close();
	}

}
