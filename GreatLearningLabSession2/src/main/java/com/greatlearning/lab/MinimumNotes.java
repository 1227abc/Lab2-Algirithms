package com.greatlearning.lab;

import java.util.Scanner;

public class MinimumNotes {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size of currency denominations ");
		int size = scan.nextInt();

		int notes[] = new int[size];
		int numNotes[] = new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < notes.length; i++) {
			notes[i] = scan.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int amount = scan.nextInt();

		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort(notes, 0, notes.length - 1);

		try {
			for (int i = 0; i < notes.length; i++) {
				int n = (int) amount / notes[i];
				numNotes[i] = n;

				amount = amount - (notes[i] * n);

				if (i == notes.length - 1 && amount != 0) {
					System.out.println("Amount cannot be paid with these denominations");
				} else if (i == notes.length - 1 && amount == 0) {
					for (int j = 0; j < numNotes.length - 1; j++) {

						System.out.println(notes[j] + ":" + numNotes[j]);
					}
				}

			}
		} catch (Exception e) {
			System.out.println("Entered 0 as the denomination");

		}

	}

}
