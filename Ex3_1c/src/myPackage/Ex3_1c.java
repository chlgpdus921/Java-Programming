package myPackage;

import java.util.Scanner;

public class Ex3_1c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade = sc.next().charAt(0);
		double gradeValue;
		switch (grade) {
		case 'A':
		case 'a':
			gradeValue = 4.0;
			break;
		case 'B':
		case 'b':
			gradeValue = 3.0;
			break;
		case 'C':
		case 'c':
			gradeValue = 2.0;
			break;
		case 'D':
		case 'd':
			gradeValue = 1.0;
			break;
		default:
			gradeValue = 0.0;
			break;
		}
		System.out.println(gradeValue);
		sc.close();
	}
}
