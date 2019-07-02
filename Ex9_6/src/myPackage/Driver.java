package myPackage;

public class Driver {
	public static void main(String[] args) {
		Person a = new Person("HyeYeon");
		Person b = new Person("HyeYaan");
		Vehicle[] v = new Vehicle[] { new Vehicle("V", 8, a), new Vehicle("V", 8, a) };

		Truck[] t = new Truck[] { new Truck("H", 8, a), new Truck("a", 10, b) };
		/* Test truck */
		t[0].setLoadCapacity(10.8);
		t[0].setTowingCapacity(5.5);
		t[1].setLoadCapacity(10.9);
		t[1].setTowingCapacity(5.5);

		t[0].writeOutput();
		t[1].writeOutput();

		System.out.println(t[0].equals(t[1]));
		System.out.println();

		/* Test Vehicle */
		v[0].writeOutput();
		v[1].writeOutput();
		System.out.println(v[0].equals(v[1]));
	}
}