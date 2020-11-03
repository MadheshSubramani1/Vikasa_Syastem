package javaInterviewQuestions;

import java.util.Scanner;

public class CountTheDigit {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		long number=scanner.nextLong();
		
		int digit=0;
		while(number>0) {
			digit++;
			number=number/10;
		}
		System.out.println(digit);
	}

}
