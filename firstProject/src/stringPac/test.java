package stringPac;

public class test {

	public static void main(String[] args) {
		

		String splitMe="where is my book";
		
		String[] splitedWords= splitMe.split(" ");
		
		System.out.println(String.join("-", splitedWords));
		System.out.println(String.join("/", "12","12","1998"));
		
		for(String string:splitedWords) {
			System.out.println(string);
		}
	}
}
