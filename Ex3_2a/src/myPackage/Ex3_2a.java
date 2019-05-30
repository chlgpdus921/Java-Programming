package myPackage;

import java.util.Scanner;

public class Ex3_2a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, max = -1, min = -1, sum = 0, cnt = 0;
		boolean isFirst = true;
		double avg;
		while (true) {
			num = sc.nextInt();
			if (num < 0) {
				break;
			}
			if (isFirst) {
				min = num;
				max = num;
				isFirst = false;
			}
			if (max < num) {
				max = num;
			}
			if (min > num) {
				min = num;
			}
			sum += num;
			cnt++;
		}
		avg = (double) sum / cnt;
		System.out.println("max: " + max + "  min : " + min + " average : " + avg);
		sc.close();
	}
}
