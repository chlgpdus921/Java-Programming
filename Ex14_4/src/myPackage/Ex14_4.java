package myPackage;

import java.util.*;

public class Ex14_4 {
	public static void main(String[] args) {
		ArrayList<Pet> pet = new ArrayList<Pet>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			Pet newPet = new Pet();

			System.out.print("Enter the pet name: ");
			newPet.setName(sc.nextLine());
			System.out.print("Enter the pet age: ");
			newPet.setAge(sc.nextInt());
			System.out.print("Enter the pet weight: ");
			newPet.setWeight(sc.nextDouble());
			pet.add(newPet);
			System.out.println("\nEnter another pet? (y or n) ");
			char yOrN = sc.next().charAt(0);
			if (yOrN == 'n' || yOrN == 'N')
				break;
		}

		for (int i = 0; i < pet.size(); i++) {
			for (int j = i; j < pet.size(); j++) {
				if (pet.get(i).getName().compareTo(pet.get(j).getName()) > 0) {
					Pet temp = new Pet();
					temp = pet.get(i);
					pet.set(i, pet.get(j));
					pet.set(j, temp);
				}
			}
		}

		for (int i = 0; i < pet.size(); i++) {
			System.out.println(pet.get(i));
		}
		sc.close();
	}
}
