package myPackage;

import java.util.Scanner;

public class Ex3_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int num = 0;
		double interest, balance;
		while (true) {
			System.out.println("Select what you want: 1.calculation 2.exit");
			num = sc.nextInt();
			if (num == 2)
				break;
			else if (num > 2) {
				System.out.println("Enter the list number!!!");
				continue;
			}
			System.out.print("Enter the interest: ");
			interest = sc.nextDouble();
			System.out.print("Enter the balance: ");
			balance = sc.nextDouble();
			double temp = balance;
			for (int i = 0; i < 10; i++) {
				balance += (balance * interest / 100);
			}
			sb.append("annually : " + balance);
			balance = temp;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 12; j++) {
					balance += (balance * (interest / 12 / 100));
				}
			}
			sb.append("  monthly : " + balance);
			balance = temp;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 365; j++) {
					balance += (balance * (interest / 365 / 100));
				}
			}
			sb.append("  daily : " + balance);
			System.out.println(sb + "");
			sb.delete(0, sb.length());
		}
		sc.close();

	}
}
