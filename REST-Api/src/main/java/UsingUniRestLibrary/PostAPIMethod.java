package UsingUniRestLibrary;

import java.io.IOException;

import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class PostAPIMethod {

	public static void main(String[] args) throws UnirestException, IOException {
		
		HttpResponse<JsonNode> jsonResponse = Unirest.post("http://dummy.restapiexample.com/api/v1/create")
				.header("Content-Type", "application/json")
				.basicAuth("", "")
				.body("{\"name\":\"Subramani\",\"salary\":\"12\",\"age\":\"15\"}").asJson();


		System.out.println("Response Code "+jsonResponse.getStatus());
		System.out.println("Response Message "+ jsonResponse.getStatusText());
		System.out.println("Respons Body " + jsonResponse.getBody());

		JSONObject jsonObject = jsonResponse.getBody().getObject();

		System.out.println(jsonObject.get("status"));

		JSONObject jsonObject2 = new JSONObject(jsonObject.getJSONObject("data").toString());
		System.out.println(jsonObject2.getInt("id"));


	}

}
