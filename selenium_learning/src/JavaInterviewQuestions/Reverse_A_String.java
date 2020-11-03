package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Reverse_A_String {

	public static void usingForLoop() {

		String name = "Madhesh Subramani";

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));

		}
		System.out.println("\n");
	}
	
	

	public static void usingForLoop1() {

		String name = "Madhesh Subramani";
		char[] characterArray = name.toCharArray();

		for (int i = characterArray.length - 1; i >= 0; i--) {

			System.out.print(characterArray[i]);
		}
		System.out.println("\n");

	}

	
	public static void usingForLoop2() {

		String name = "Madhesh Subramani";

		char[] characterArray = name.toCharArray();

		String reversed = "";

		for (int i = characterArray.length - 1; i >= 0; i--) {

			reversed = reversed + characterArray[i];
		}
		System.out.println(reversed);
		System.out.println("\n");
	}
	

	public static void usingCollection() {

		String name = "Madhesh Subramani";
		char[] characterArray = name.toCharArray();

		List<Character> list = new ArrayList<Character>();
		for (Character character: characterArray) {

			list.add(character);
		}
		
		Collections.reverse(list);

		Iterator iterator =list.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
	}

	public static void usingStringBuffer() {

		String name = "Madhesh Subramani";

		StringBuffer buffer = new StringBuffer();
		buffer.append(name);
		System.out.println(buffer.reverse());
	}

	public static void main(String[] args) {
		usingForLoop();
		usingForLoop1();
		usingForLoop2();
		usingCollection();
		usingStringBuffer();
	
	}

}
