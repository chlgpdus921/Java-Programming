package myPackage;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;

public class Ex13_1a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("Error opening the file" + fileName);
			System.exit(0);
		}

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 100 + 1);
			outputStream.println(num);
		}

		outputStream.close();
		int[] arr = new int[10];
		int i = 0, sum = 0;
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("Error opening the file" + fileName);
			System.exit(0);
		}

		System.out.println("file read!");
		while (inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			arr[i] = Integer.valueOf(line);
			System.out.println(arr[i]);
			sum += arr[i];
			i++;
		}
		inputStream.close();
		Arrays.sort(arr);
		System.out.println("min: " + arr[0]);
		System.out.println("max: " + arr[9]);
		System.out.println("sum: " + sum);
		System.out.println("average: " + sum / 10.0);
		sc.close();
	}

}
