package myPackage;

import java.util.Scanner;

public class ShoulderSurfing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] password = { 9, 7, 9, 2, 1 };
		int[] num = new int[10];
		int[] inputPassword = new int[password.length];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			num[i] = (int) (Math.random() * 3) + 1;
		}

		System.out.println("PIN: 0 1 2 3 4 5 6 7 8 9");
		System.out.print("NUM: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(num[i] + " ");
		}

		System.out.println("\nEnter the password(you set password(97921): ");
		String input = sc.nextLine();
		for (int i = 0; i < input.length(); i++) {
			inputPassword[i] = Integer.valueOf(input.charAt(i) + "");
			if (inputPassword[i] == num[password[i]]) {
				sum++;
			}
		}
		if (sum == password.length)
			System.out.println("Correct! you entered correct password");
		else
			System.out.println("Wrong. This password is not exist");

		sc.close();

	}

}