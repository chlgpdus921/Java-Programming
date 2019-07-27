package myPackage;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ex13_2a {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the file name: ");
		Scanner keyboard = new Scanner(System.in);
		String fileName = keyboard.next();
		keyboard.close();

		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			for (int i = 0; i < 10; i++)
				outputStream.writeDouble(Math.random() * 15);
			outputStream.close();
		} catch (IOException e) {
			System.out.println("Error opening the file " + fileName);
			System.exit(0);
		}
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
		int i = 0;
		double sum = 0;
		double[] arr = new double[10];
		try {
			while (true) {
				double num = inputStream.readDouble();
				arr[i] = num;
				System.out.println(arr[i]);
				sum += arr[i];
				i++;
			}
		} catch (IOException e) {
			System.out.println("Error opening the file " + fileName);
		}
		inputStream.close();
		Arrays.sort(arr);
		System.out.println("Min: " + arr[0]);
		System.out.println("Max: " + arr[9]);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + sum / 10.0);
	}
}
