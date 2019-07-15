package myPackage;

import java.util.Scanner;

public class Demo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String line;

			System.out.println("Type the Month and day : ");
			line = sc.nextLine();

			if (MonthException.checkMonth(line) == -1)
				throw new MonthException();

			if (DayException.checkday(MonthException.returnMonth(line), line) == -1)
				throw new DayException();

			System.out.println("Convert : " + MonthException.convertMonth(line) + " " + DayException.returnday(line));
		} catch (MonthException m) {
			System.out.println(m.getMessage());
		} catch (DayException d) {
			System.out.println(d.getMessage());
		}
		System.out.println("End ");
		sc.close();
	}

}
