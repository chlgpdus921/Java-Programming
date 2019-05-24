package myPackage;

import java.util.Scanner;

public class Ex2_3a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int price = sc.nextInt();
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
