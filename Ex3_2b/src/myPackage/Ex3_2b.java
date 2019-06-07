package myPackage;

import java.util.Scanner;

public class Ex3_2b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int a = 0, b = 0, c = 0, d = 0, e = 0;
		while (true) {
			num = sc.nextInt();
			if (num < 0) {
				break;
			}
			if (num >= 90 && num <= 100) {
				a++;
			} else if (num >= 80 && num <= 89) {
				b++;
			} else if (num >= 70 && num <= 79) {
				c++;
			} else if (num >= 60 && num <= 69) {
				d++;
			} else if (num >= 0 && num <= 59) {
				e++;
			}
		}
		System.out.println(
				"A count: " + a + ", B count: " + b + ", C count: " + c + ", D count: " + d + ", F count:" + e);
		sc.close();
	}

}
