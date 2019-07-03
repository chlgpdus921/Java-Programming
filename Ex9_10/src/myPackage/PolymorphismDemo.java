package myPackage;

public class PolymorphismDemo {

	public static void main(String[] args) {
		Person[] people = new Person[7];
		people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
		people[1] = new Undergraduate("Kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);
		people[4] = new Employee("Cotty, Manny", 4910, "NAVER");
		people[5] = new Staff("Kick, Anita", 9931, "GACHON", 4400);
		people[6] = new Faculty("DeBanque, Robin", 8812, "GOOGLE", "GG");
		
		for (Person p : people) {
			p.writeOutput();
			System.out.println();
		}
	}

}
