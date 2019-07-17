package myPackage;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, salary;
		String name, SSN;

		System.out.println("Type the number of employee : ");
		num = sc.nextInt();
		Employee[] employee = new Employee[num];

		for (int i = 0; i < num; i++)
			employee[i] = new Employee();

		for (int i = 0; i < num; i++) {
			try {
				System.out.println("Type the name : ");
				name = sc.next();
				employee[i].setName(name);

				System.out.println("Type the salary : ");
				salary = sc.nextInt();
				employee[i].setSalary(salary);

				System.out.println("Enter the SSN : ");
				SSN = sc.next();
				employee[i].setSSN(SSN);

				System.out.println("");

				if (!SSNLengthException.ValidLength(SSN))
					throw new SSNLengthException("Exception : Error of type SSN Length ");
				if (!SSNCharacterException.ValidCharacter(SSN))
					throw new SSNCharacterException("Exception : Error of type SSN Character ");
			}

			catch (SSNLengthException lenexception) {
				System.out.println(lenexception.getMessage());
				System.out.println("\n");
			}

			catch (SSNCharacterException chexception) {
				System.out.println(chexception.getMessage());
				System.out.println("\n");
			}
		}

		System.out.println("==================================================");
		System.out.println("==================================================");
		for (int i = 0; i < num; i++) {
			System.out.println(i+"'s Name : " + i + employee[i].getName());
			System.out.println(i+"'s Salary : " + i + employee[i].getSalary());
			System.out.println(i+"'s getSSN : " + i + employee[i].getSSN());
		}
		sc.close();
	}
}