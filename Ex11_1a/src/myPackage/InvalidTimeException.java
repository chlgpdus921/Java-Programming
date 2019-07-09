package myPackage;

public class InvalidTimeException extends Exception {
	private static final long serialVersionUID = 1L;

	public static boolean checkTime(String t) {
		String temp = t.substring(0, t.indexOf(':'));
		String temp2 = t.substring(t.indexOf(':') + 1, t.indexOf(' '));
		String pm = t.substring(t.indexOf(' ') + 1);
		int n = Integer.parseInt(temp);
		int n2 = Integer.parseInt(temp2);

		if (((n >= 0 && n <= 12) && (n2 >= 0 && n2 <= 59) && (pm.equals("am") || pm.equals("pm"))))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		try {
			if (!checkTime("8:55 am"))
				throw new InvalidTimeException();
			System.out.println("Valid Time");

			if (!checkTime("11:666pm"))
				throw new InvalidTimeException();
			System.out.println("Valid Time");
		} catch (Exception e) {
			System.out.println("Invalid Time");
		}

	}
}
