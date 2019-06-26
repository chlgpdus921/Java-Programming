package myPackage;

import java.util.*;

public class Ex7_1b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] frequency = new int[10];
		Arrays.setAll(frequency, i -> 0);

		while (true) {
			System.out.println("1.frequency  2.finish");
			int cal = sc.nextInt();
			String buffer = sc.nextLine();
			if (cal == 2)
				break;
			else if (cal == 1) {
				System.out.println("Enter your phoneNumber");
				String phoneNum = sc.nextLine();
				for (int i = 0; i < phoneNum.length(); i++) {
					String temp = phoneNum.charAt(i) + "";
					if (temp.equals("-"))
						continue;
					frequency[Integer.valueOf(temp)]++;
				}
				for (int i = 0; i < frequency.length; i++) {
					System.out.println("f[" + i + "] = " + frequency[i]);
				}
				Arrays.setAll(frequency, i -> 0);
			} else
				System.out.println("Enter 1 or 2...!");
		}
		sc.close();
	}

}
