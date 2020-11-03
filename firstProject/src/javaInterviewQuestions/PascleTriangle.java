package javaInterviewQuestions;

import java.util.Scanner;

public class PascleTriangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");

		int number = scanner.nextInt();
		int space = number;
		for (int row = 0; row < number; row++) {

			for (int s = 0; s < space; s++) {
				System.out.print(" ");
			}
			space--;
			int startingNumber=1;
			for(int Column=0; Column<=row;Column++) {
				
				System.out.print(startingNumber+ " ");
				
				startingNumber=startingNumber*(row-Column)/(Column+1);
				//startingNumber++;
			}
			System.out.println();
		}

	}

}
