package javaInterviewQuestions;

import java.util.stream.IntStream;

public class ElementPresentInGivenArrayOrNot {
	
	static int[] values= {2,3,1,5,7,8};
	static int searchableElement=6;
	static boolean present=false;
	
	public static void usingLoop() {
		for(int value: values) {
			
			if(value==searchableElement) {
				present=true;
				break;
			}
		}
		if(present) {
			System.out.println("Searched Element is Present in the array");
		}else {
			System.out.println("searched element is not present in the array");
		}
		
	}
	
	public static void usingStream() {
		
		boolean ElementPresent=IntStream.of(values).anyMatch(element -> element ==searchableElement);
		if(ElementPresent) {
			System.out.println("Searched Element is Present in the array");
		}else {
			System.out.println("searched element is not present in the array");
		}
	}
	public static void main(String[] args) {
		
		 //usingLoop();
		 usingStream();
	}

}
