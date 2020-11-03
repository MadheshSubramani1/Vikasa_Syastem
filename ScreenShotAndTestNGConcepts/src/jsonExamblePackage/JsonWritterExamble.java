package jsonExamblePackage;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritterExamble {

	public static void main(String[] args) throws IOException {

		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("Name", "Subramani");
		jsonObject.put("Age", 52);
		
		JSONArray array=new JSONArray();
		
		array.add("Former");
		array.add("Hard Worker");
		
		jsonObject.put("Special Qualities", array);
		
		FileWriter fileWriter=new FileWriter("Appa.json");
		
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();

	}

}
