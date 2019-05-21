package myPackage;

import java.util.Scanner;

public class Ex2_1a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int val = 1000, digit;
		while (true) {
			digit = num / val;
			num = num % val;
			val /= 10;
			System.out.println(digit);
			if (num == 0)
				break;
		}
		sc.close();
	}
}
