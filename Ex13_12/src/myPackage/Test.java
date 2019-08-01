package myPackage;

import java.util.Scanner;
import java.io.*;

public class Test {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String fileName = "haberman.data";
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(fileName));
		} catch(FileNotFoundException e) {
			System.out.println("Error opening the file" + fileName);
			System.exit(0);
		}
		
		int status, axillary, index;
		String current;
		double aver1 = 0, aver2 = 0;
		int count1 = 0, count2 = 0;
		
		while (inputStream.hasNextLine()) {
			current = inputStream.nextLine();
			index = current.lastIndexOf(",");
			status = Integer.parseInt(current.substring(index + 1));
			System.out.println(status);
			current = current.substring(0,  index);
			index = current.lastIndexOf(",");
			axillary = Integer.parseInt(current.substring(index + 1));
			System.out.println(axillary);
			if (status == 1) {
				aver1 += axillary;
				count1++;
			}
			else if (status == 2) {
				aver2 += axillary;
				count2++;
			}
		}
		
		aver1 = aver1 / count1;
		aver2 = aver2 / count2;
		System.out.println("The average number of positive axillary nodes detected for patients");
		System.out.println("who survived 5 years or longer: " + aver1);
		System.out.println("who died within 5 years: " + aver2);
		
		sc.close();
	}
}
