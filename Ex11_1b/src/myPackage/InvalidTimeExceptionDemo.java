package myPackage;

public class InvalidTimeExceptionDemo {

	public static boolean checkTime(String t) {

		String hh = t.substring(0, t.indexOf(':'));
		String mm = t.substring(t.indexOf(':') + 1, t.indexOf(' '));
		String pm = t.substring(t.indexOf(' ') + 1);

		if (pm.equals("am") || pm.equals("pm")) {
			try {
				if (Integer.parseInt(hh) >= 0 && Integer.parseInt(hh) <= 12) {
					try {
						if (Integer.parseInt(mm) >= 0 && Integer.parseInt(mm) <= 59)
							return true;
						throw new InvalidMinuteException();
					} catch (Exception e) {
						System.out.println(e.getMessage());
						return false;
					}
				} else
					throw new InvalidHourException();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return false;
			}
		} else
			return false;
	}

	public static void main(String[] args) {
		String t = "12:65 am";
		String t2 = "13:11 pm";
		try {
			if (!checkTime(t))
				throw new InvalidTimeException();
			System.out.println(t);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			if (!checkTime(t2))
				throw new InvalidTimeException();
			System.out.println(t2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
