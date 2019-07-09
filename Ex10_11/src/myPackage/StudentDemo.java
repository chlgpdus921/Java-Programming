package myPackage;

import java.util.Arrays;

public class StudentDemo {

	public static void main(String[] args) {
		Student[] student = new Student[5];

		student[0] = new Student("hye yeon", 10);
		student[1] = new Student("chocho", 50);
		student[2] = new Student("juny", 40);
		student[3] = new Student("yeony", 30);
		student[4] = new Student("hyeng ju", 20);
		Arrays.sort(student);

		for (Student s : student)
			s.writeOutput();
	}

}
