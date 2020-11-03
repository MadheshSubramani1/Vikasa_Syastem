package javaInterviewQuestions;

import java.util.Scanner;

public class ExambleOfTriangle {
	
	public static void Triangle1() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number =scanner.nextInt();
		int space=number;
		
		for(int row=0;row<number;row++) {
			
			for(int s=0; s<space;s++) {
				System.out.print(" ");
			}
			space--;
			
			for(int column=0; column<=row; column++) {
				
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}
	
	public static void Triangle2() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		
		int number =scanner.nextInt();
		int space=number;
		int num=1;
		for(int row=0;row<number;row++) {
			
			for(int s=0;s<space;s++) {
				
				System.out.print(" ");
			}
			space--;
			
			for(int column=0; column<=row;column++) {
				
				System.out.print(num +" ");
				num++;
			}
			System.out.println();
		}
	}
	public static void Triangle3() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		
		int number =scanner.nextInt();
		int space=number;
		
		for(int row=0;row<number;row++) {
			
			for(int s=0;s<space;s++) {
				
				System.out.print(" ");
			}
			space--;
			int num=1;
			for(int column=0; column<=row;column++) {
				
				System.out.print(num +" ");
				num++;
			}
			System.out.println();
		}
	}

	public static void Triangle4() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int value=scanner.nextInt();
		int number=1;
		int space=value;
		
		for(int row=0; row<value;row++) {
			
			for(int s=0; s<space;s++) {
				System.out.print(" ");
			}
			space--;
			for(int column=0;column<=row; column++) {
				System.out.print(number+" ");
			}
			System.out.println();
			number++;
		}
	
		
	}
	public static void main(String[] args) {
		//Triangle1();
		//Triangle2();
		//Triangle3();
		Triangle4();
	}

}
