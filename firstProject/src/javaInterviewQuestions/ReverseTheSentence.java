package javaInterviewQuestions;

public class ReverseTheSentence {

	public static void main(String[] args) {
		
		String content="My name is Madhesh";
		String reversedContent="";
		
		String[] splitedContent=content.split(" ");
		
		for(int i=splitedContent.length-1;i>=0;i--) {
			
			reversedContent=reversedContent+splitedContent[i]+" ";
		}
		System.out.println(reversedContent);

	}

}
