package myPackge;

import java.util.Scanner;

public class Ex3_1b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int price = sc.nextInt();
		if (price < 25) {
			System.out.println("Error!!! The price must be greater than 25.");
			System.exit(0);
		} else if (price > 100) {
			System.out.println("Error!!! The price should be no more than 100.");
			System.exit(0);
		} else if (price % 5 != 0) {
			System.out.println("Error!!! The price should be a multiple of 5.");
			System.exit(0);
		} else {
			int change = 100 - price;
			int q = 0, d = 0, n = 0;
			sb.append("for an item of " + price + "cents, " + "the change is " + change + "cents, which is given by ");
			if (change >= 25) {
				q = change / 25;
				change = change % 25;
			}
			if (change >= 10) {
				d = change / 10;
				change = change % 10;
			}
			if (change >= 5) {
				n = change / 5;
				change = change % 5;
			}
			System.out.println(sb + "" + q + " quarters, " + d + " dimes, and " + n + " nickels");
			sc.close();
		}
	}
}
