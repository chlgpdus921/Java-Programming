package myPackage;

public class TimeDemo {
	public static void main(String[] args) {
		Time time = new Time(10, 4, true);
		System.out.println(time.getTime12());
		System.out.println(time.getTime24());

		Time time2 = new Time(06, 30);
		System.out.println(time2.getTime12());
		System.out.println(time2.getTime24());
	}

}
