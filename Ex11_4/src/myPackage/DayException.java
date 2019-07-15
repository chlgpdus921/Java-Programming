package myPackage;

public class DayException extends Exception {
	private static final long serialVersionUID = 1L;

	DayException() {
		super("Day Error ");
	}

	DayException(String error) {
		super(error);
	}

	public static int returnday(String line) {
		int position = line.indexOf('/');
		int day = Integer.valueOf(line.substring(position + 1));

		return day;
	}

	public static int checkday(int month, String line) {
		int day = returnday(line);

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			if (day >= 1 && day <= 31)
				return 0;

			else if (month == 4 || month == 6 || month == 9 || month == 11)
				if (day >= 1 && day <= 30)
					return 0;
				else if (day >= 1 && day <= 28)
					return 0;
		return -1;
	}
}