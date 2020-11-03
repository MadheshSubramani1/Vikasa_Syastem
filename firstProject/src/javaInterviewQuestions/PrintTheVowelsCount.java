package javaInterviewQuestions;

public class PrintTheVowelsCount {

	public static void main(String[] args) {
		
		String text="Madhesh9741@gmail.com";
		
		StringBuffer vowels=new StringBuffer();
		StringBuffer consonants=new StringBuffer();
		StringBuffer numbers=new StringBuffer();
		StringBuffer specialCharacter=new StringBuffer();
		
		int vowelsCount=0;
		int consonantsCount=0;
		int numbersCount=0;
		int specialCharacterCount=0;
		
		for(int i=0;i<text.length();i++) {
			
			char ch=text.charAt(i);
			
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					
					vowelsCount++;
					vowels.append(ch);
				}
				else {
					consonantsCount++;
					consonants.append(ch);
				}
				
			}else if(ch>='0' &&ch<='9') {
				numbersCount++;
				numbers.append(ch);
			}else {
				specialCharacter.append(ch);
				specialCharacterCount++;
			}
		}
		
		System.out.println("vowels count "+ vowelsCount);
		System.out.println("Consonants count "+ consonantsCount);
		System.out.println("numbers count "+ numbersCount);
		System.out.println("specialCharacter count "+ specialCharacterCount);
		
		System.out.println("--------------------------------------");
		System.out.println("Vowels "+ vowels);
		System.out.println("Consonants "+ consonants);
		System.out.println("Numbers "+ numbers);
		System.out.println("Special Characters "+ specialCharacter);
		
		
	}

}
