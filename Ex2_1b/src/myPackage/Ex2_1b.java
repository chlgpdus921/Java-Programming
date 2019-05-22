package myPackage;

import java.util.Scanner;

public class Ex2_1b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temperature in Fahrenheit: ");
		int f = sc.nextInt();
		double c;
		c = 5 * (f - 32) / 9;
		System.out.println("Celsius : " + c);

		sc.close();
		}

}
