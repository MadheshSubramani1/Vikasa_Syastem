package jsonExamblePackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReaderExamble {

	public static void main(String[] args) throws IOException, ParseException {
		

		JSONParser jsonParser=new JSONParser();
		
		FileReader fileReader=new FileReader("Appa.json");
		
		Object object=jsonParser.parse(fileReader);
		
		JSONObject jsonObject=(JSONObject) object;
		
		String Name=(String) jsonObject.get("Name");
		
		Long Age=(Long) jsonObject.get("Age");
		
		JSONArray array=(JSONArray) jsonObject.get("Special Qualities");
		
		System.out.println("Name is - "+Name);
		System.out.println("Age is - "+Age);
		//System.out.println("Special Qualities is - "+ array);
		
		Iterator iterator= array.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("Special Qualities is - "+iterator.next());
		}
		
		
		
		
		
		
		
	}

}
