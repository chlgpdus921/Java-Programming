package myPackage;

public class Pet {
	private String name;
	private int age;
	private double weight;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("Error: Negative age.");
			System.exit(0);
		}
		this.age = age;
	}

	public void setWeight(double weight) {
		if (weight < 0) {
			System.out.println("Error: Negative weight.");
			System.exit(0);
		}
		this.weight = weight;
	}

	public String toString() {
		return ("Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\n");
	}

	public void writeOutput() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age + " years");
		System.out.println("Weight: " + weight + " pounds");
	}

	public Pet(String name, int age, double weight) {
		this.name = name;
		if ((age < 0) || (weight < 0)) {
			System.out.println("Error: Negative age or weight.");
			System.exit(0);
		}
		this.age = age;
		this.weight = weight;
	}

	public void set(String name, int age, double weight) {
		this.name = name;
		if ((age < 0) || (weight < 0)) {
			System.out.println("Error: Negative age or weight.");
			System.exit(0);
		}
		this.age = age;
		this.weight = weight;
	}

	public Pet(String name) {
		this.name = name;
		this.age = 0;
		this.weight = 0;
	}

	public void set(String name) {
		this.name = name;
	}

	public Pet(int age) {
		this.name = "No name yet.";
		this.weight = 0;
		if (age < 0) {
			System.out.println("Error: Negative age.");
			System.exit(0);
		}
		this.age = age;
	}

	public void set(double weight) {
		this.name = "No name yet.";
		this.age = 0;
		if (weight < 0) {
			System.out.println("Error: Negative weight.");
			System.exit(0);
		}
		this.weight = weight;
	}

	public Pet() {
		name = "No name yet.";
		age = 0;
		weight = 0;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

}
