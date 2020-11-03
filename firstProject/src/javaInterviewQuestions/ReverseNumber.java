package javaInterviewQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		
		int reminder;
		int reverse=0;
		
		
		while(num>0) {
		
		reminder = num%10;
		reverse = reverse*10+reminder;
		num=num/10;
		}
		System.out.println(reverse);
	}

}
