package stringPac;

public class StringMethods {

	public static void main(String[] args) {

		String name = "madheshSubramani";
		int number=10;
		String splitThis="Subramani,Selvi,Revathi,madhesh,guna";
		

		System.out.println("1 "+name.charAt(5));
		System.out.println("2 "+name.length());
		System.out.println("3 "+name.concat("selvi"));
		System.out.println("4 "+name.equals("madheshsubramani"));
		System.out.println("5 "+name.equalsIgnoreCase("madheshSubramani"));
		System.out.println("6 "+name.concat("subramani"));
		System.out.println("7 "+name.replace("madhesh", "Guna"));
		System.out.println("8 "+name.replace('m', 'M'));
		System.out.println("9  "+name.substring(5));
		System.out.println("10 "+name.substring(5, 8));
		System.out.println("11 "+name.indexOf('a'));
		System.out.println("12 "+name.indexOf('a', 2));
		System.out.println("13 "+name.isEmpty());
		System.out.println("14 "+String.valueOf(number));
		System.out.println("15 "+name.indexOf("ma",3));
		System.out.println("16 "+name.indexOf("ma"));
		System.out.println("17 "+name.trim());
		
		
		System.out.println("18 "+String.join("-" , "my", "name", "is" ,"madhesh"));
		System.out.println("19 "+String .join("/", "16" , "04","1997"));
		System.out.println("20 "+name.toLowerCase());
		System.out.println("21 "+name.toUpperCase());
		
		String[] splidwords=splitThis.split(",");
		
	// System.out.println(String.join("-", splidwords));
		  
		  for(String string:splidwords) {
			  System.out.println("22 "+string);
			

			  
			  
		  }

	}

}
