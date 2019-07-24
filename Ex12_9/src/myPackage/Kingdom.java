package myPackage;

import java.util.Scanner;

public class Kingdom {
	public static int getTotalGrains(int k, int grains) {
		int total = 0;
		if (k == 1)
			return grains;
		else {
			total = grains + getTotalGrains(k - 1, 2 * grains);
			return total;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter k : ");
		num = sc.nextInt();
		System.out.println("Total : " + getTotalGrains(num, 1));
		sc.close();
	}
}
