package javaInterviewQuestions;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		printPrimeNumberUntilEntered();
		// printEnteredNumberPrimeorNot();

	}

	public static void printPrimeNumberUntilEntered() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int input = sc.nextInt();
		int num = input;

		for (int i = 2; i < num; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime) {
				System.out.println(i + " is prime");
			} else {
				System.out.println(i + " is not prime");
			}
		}
	}

	public static void printEnteredNumberPrimeorNot() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int input = sc.nextInt();
		int num = input;
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println(num + " is prime");

		} else {
			System.out.println(num + " is not prime");

		}
	}

}