package com.greatlearning.lab;

import java.util.Scanner;

public class Transactions {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of transactions");

		int size = scan.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the transactions values");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		int numtargets = scan.nextInt();

		for (int i = 0; i < numtargets; i++) {

			System.out.println("Enter the value of target");
			int targetValue = scan.nextInt();

			int sum = 0;
			for (int j = 0; j < arr.length; j++) {

				sum = sum + arr[j];

				if (sum >= targetValue) {
					System.out.println("Target is acheived after " + (j + 1) + " transactions");
					break;
				}
			}

				if (sum < targetValue) {
					System.out.println("Target is not acheived ");
				}
			

		}
	}

}
