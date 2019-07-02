package myPackage;

public class Pet {

	private String name;
	private int age;
	private double weight;

	public Pet() {
		name = "No name yet.";
		age = 0;
		weight = 0;

	}

	public Pet(String initialName, int initialAge, double initialWeight) {
		name = initialName;
		if (initialAge < 0 || initialWeight < 0) {
			System.out.println("Error : Negative age or weight");
			System.exit(0);
		} else {
			age = initialAge;
			weight = initialWeight;
		}
	}

	public void setPet(String newName, int newAge, double newWeight) {
		name = newName;
		if (newAge < 0 || newWeight < 0) {
			System.out.println("Error : Negative age or weight");
			System.exit(0);
		} else {
			age = newAge;
			weight = newWeight;
		}
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

	public void writeOutput() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age + " years");
		System.out.println("Weight : " + weight + " pounds");
	}
}
