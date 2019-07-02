package myPackage;

public class DogDemo {
	public static void main(String[] args) {
		Dog[] d = new Dog[5];
		d[0] = new Dog("a", 3, 5, "Bool", true);
		d[1] = new Dog("b", 3, 6, "Bool", false);
		d[2] = new Dog("c", 2, 5, "Pudle", false);
		d[3] = new Dog("d", 1, 2, "Pudle", true);
		d[4] = new Dog("e", 5, 3, "Pudle", false);

		for(int i = 0; i<d.length; i++){
			d[i].writeOutput();
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			if (d[i].getAge() >= 2 && d[i].getBoosterShot() == false)
				System.out.println(d[i].getName() + " " + d[i].getBreed());
		}
	}
}
