package javaInterviewQuestions;

import java.util.Scanner;

public class findSmallestNumberFromUserInput {

	public static void main(String[] args) {

		int numbers[];
		int size;

		System.out.println("Enter the size of an array: ");
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		numbers = new int[size];
		System.out.println("Enter the data: ");
		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = scanner.nextInt();
		}

		int smallestNumber = numbers[0];
		int largestNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {

			if (smallestNumber > numbers[i]) {

				smallestNumber = numbers[i];
			} else if (largestNumber < numbers[i]) {
				largestNumber = numbers[i];
			}
		}
		System.out.println("Smallest Number : " + smallestNumber);
		System.out.println("Largest Number : " + largestNumber);
	}

}
