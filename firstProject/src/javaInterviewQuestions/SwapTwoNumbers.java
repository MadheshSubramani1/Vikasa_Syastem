package javaInterviewQuestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		int a;
		
		System.out.println("before swap");
		System.out.println("x ="+x+" y ="+y);
		
		
		
		/*a=x;
		x=y;                         //with third party 
		y=x;  */
		
		x=x-y;
		y=x+y;                    //without third party
		x=y-x;
		
		System.out.println("After swap");
		System.out.println("x ="+x+" y ="+y);

	}

}
