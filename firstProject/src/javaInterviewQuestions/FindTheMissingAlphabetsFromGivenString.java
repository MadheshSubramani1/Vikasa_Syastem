package javaInterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class FindTheMissingAlphabetsFromGivenString {

	public static void main(String[] args) {

		String given = "Madhesh Subramani";
		given = given.toLowerCase();
		given = given.replace(" ", "");
		String[] givenArray = given.split("");

		System.out.println("Given String "+Arrays.toString(givenArray));

		String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
		System.out.println("Alphabets "+Arrays.toString(alphabet));
		
		HashSet<String> set1=new HashSet<String>();
		
		for(String s:givenArray) {
			set1.add(s);
		}

		HashSet<String> set2=new HashSet<String>(Arrays.asList(alphabet));
		
		set2.removeAll(set1);
		System.out.println("Missing Alphabet from Given string "+set2);
	}

}
