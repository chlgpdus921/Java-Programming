package myPackage;

public class Time {
	private int hour;
	private int minute;

	Time() {
		this.hour = 0;
		this.minute = 0;
	}

	Time(int hour, int minute) {
		if (isValid(hour, minute)) {
			this.hour = hour;
			this.minute = minute;
			System.out.println("hour: " + hour + "  minute: " + minute);
		} else {
			System.out.println("hour, minute is not valid.");
		}
	}

	Time(int hour, int minute, boolean isPM) {
		if (isPM) {
			hour = hour + 12;
		}
		setTime(hour, minute);
	}

	public String getTime24() {
		return String.format("%02d%02d", hour, minute);
	}

	public String getTime12() {
		if (hour >= 12)
			return String.format("%02d:%02d %s", (hour-12), minute, "pm");
		return String.format("%d:%02d %s", hour, minute, "am");

	}

	private static boolean isValid(int hour, int minute) {
		if ((hour >= 0 && hour < 24) && (minute >= 0 && minute < 60)) {
			return true;
		}
		return false;
	}

	public void setTime(int hour, int minute) {
		if (isValid(hour, minute)) {
			this.hour = hour;
			this.minute = minute;
			System.out.println("hour: " + hour + "  minute: " + minute);
		} else {
			System.out.println("hour, minute is not valid.");
		}
	}

	public void setTime2(int hour, int minute, boolean isPM) {
		if (isPM) {
			hour = hour + 12;
		}
		setTime(hour, minute);
	}

}
