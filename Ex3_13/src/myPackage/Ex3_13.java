package myPackage;

import java.util.Scanner;

public class Ex3_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num * 2 - 1; i++) {
			if (i < num) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = i; j < num * 2 - 1; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
