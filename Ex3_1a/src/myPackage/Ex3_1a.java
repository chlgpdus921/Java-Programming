package myPackage;

import java.util.Scanner;

public class Ex3_1a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the check amount: ");
		int check = sc.nextInt();
		double charge;
		if (check < 10) {
			charge = 1;
		} else if (check < 100) {
			charge = check * 0.1;
		} else if (check < 1000) {
			charge = 5 + check * 0.05;
		} else {
			charge = 40 + check * 0.01;
		}
		System.out.println("cashing charge : " + charge);
		sc.close();
	}
}
