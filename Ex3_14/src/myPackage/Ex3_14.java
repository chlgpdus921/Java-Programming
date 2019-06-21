package myPackage;

import java.util.Scanner;

public class Ex3_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the initial velocity of the ball: ");
		double newHeight = sc.nextInt();
		int time = 0;
		double height = 0.0;
		System.out.println("Time: " + time + "  Hight: " + height);
		time++;
		int cnt = 0;
		while (true) {
			height = (newHeight - height) + (newHeight - 32);
			double temp = height;
			height = newHeight;
			newHeight = temp;

			System.out.println("Time: " + time + "  Hight: " + height);
			time++;
			if (newHeight < 0) {
				System.out.println("Bounce!");
				height *= -0.5;
				newHeight *= -0.5;
				cnt++;
			}
			if (cnt == 5)
				break;
		}
		sc.close();
	}

}
