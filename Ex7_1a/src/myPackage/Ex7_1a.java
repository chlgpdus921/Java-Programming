package myPackage;

import java.util.*;

public class Ex7_1a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int[] score = new int[n];
		for(int i = 0; i<score.length; i++){
			score[i] = sc.nextInt();
			sum += score[i];
		}
		double avg = (double)sum/score.length;
		System.out.println("Average : "+ avg);
		System.out.println("scores above the average:");
		for(int i = 0; i<score.length; i++){
			if(score[i] > avg){
				System.out.println(score[i]);
			}
		}
		sc.close();
	}

}
