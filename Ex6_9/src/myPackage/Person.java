package myPackage;

public class Person {
	private String name;
	private int age;

	Person() {
		this.name = "No name yet";
		this.age = 0;
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static Person createAdult() {
		Person person = new Person("An adult", 21);
		return person;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String first, String last) {
		this.name = first + " " + last;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static Person createToddler() {
		Person toddler = new Person("A Toddler", 2);
		return toddler;
	}

	public static Person createPreschooler() {
		Person preschooler = new Person("A Perschooler", 5);
		return preschooler;
	}

	public static Person createAdolescent() {
		Person adolescent = new Person("A Adolescent", 9);
		return adolescent;
	}

	public static Person createTeenager() {
		Person teenager = new Person("A Teenager", 15);
		return teenager;
	}

}
