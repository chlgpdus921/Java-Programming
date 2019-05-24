package myPackage;

import java.util.Scanner;

public class Ex2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int a = text.indexOf(" ") + 1;
		String front = text.substring(0, a);
		String temp = text.substring(a, a + 1);
		text = text.substring(a + 1);
		temp = temp.substring(0, 1).toUpperCase();
		String result = temp + text +" "+ front;
		System.out.println(result);
		sc.close();
	}

}
