package myPackage;

import java.util.Scanner;

public class Ex1_2b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int result = n2 - n1 + 1;
		System.out.println(result);
		sc.close();
	}

}
