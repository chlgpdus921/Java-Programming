package myPackage;

import java.util.Scanner;

public class Ex2_3b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter the radius: ");
		float radius = sc.nextInt();
		System.out.println("Enter the depth: ");
		int depth = sc.nextInt();
		sb.append("a " + depth + "-foot well with a radius of " + radius + "inches holds about");
		radius /= 12;
		double v = radius * radius * depth * Math.PI * 7.48;
		v = Math.round(v);
		System.out.println(sb + " " + v + "gallons of water");
		sc.close();
	}

}
