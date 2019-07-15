package myPackage;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String code;
		String hour, check;
		char YN = 0;

		do {
			System.out.println("Enter time in 24-hour notation: ");
			hour = sc.next();
			check = hour(hour);

			if (!check.contains("That is the same as")) {
				System.out.println("Try again:");
				YN = 'y';
			} else {
				System.out.println(check);
				System.out.println("Again?(y/n)");
				code = sc.next();
				YN = code.charAt(0);
			}
		} while (YN == 'y');

		System.out.println("End of program");
		sc.close();
	}

	private static String hour(String s) {
		String hour = "", min = "", line = "";
		hour = s.substring(0, s.indexOf(':'));
		min = s.substring(3);
		int h = Integer.parseInt(hour);
		int m = Integer.parseInt(min);

		try {
			if (h >= 0 && h <= 24 && m >= 0 && m <= 59) {
				String type = "";
				if (h >= 0 && h <= 12)
					type = " am";

				else if (h > 12 && h <= 24)
					type = " pm";

				if (h > 12 && h <= 24)
					h = h - 12;
				line = String.format("%d", h);
				String str1 = String.format("%02d", m);
				line = line.concat(":");
				line = line.concat(str1);
				line = line.concat(type);
				return "That is the same as \n" + line;
			}

			else
				throw new TimeFormatException();

		} catch (TimeFormatException e) {
			System.out.println(e.getMessage() + (" " + hour + ":" + min));
		}
		return line;
	}
}
