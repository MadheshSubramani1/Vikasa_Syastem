package javaInterviewQuestions;

import java.util.Scanner;

public class ForwardReversrTriangle {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int input=scanner.nextInt();
		int space=input-1;
		int odd=1;
		
		for(int row=0; row<input;row++) {
			
			for(int s=0; s<space;s++) {
				System.out.print(" ");
			}
			space--;
			int k=0;
			for(int column=0; column<odd; column++) {
				
				
				if (column<=row) {
					k=k+1;
				}else {
					k=k-1;
				}
				System.out.print(k);
				
			}
			System.out.println();
			odd=odd+2;
		}

	}

}
