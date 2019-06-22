package myPackage;

import java.util.*;

public class GradeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Grade grade = new Grade();
		grade.setA(sc.nextInt());
		grade.setB(sc.nextInt());
		grade.setC(sc.nextInt());
		grade.setD(sc.nextInt());
		grade.setF(sc.nextInt());
		
		grade.format();
		grade.graphA();
		grade.graphB();
		grade.graphC();
		grade.graphD();
		grade.graphF();
		sc.close();
	}

}
