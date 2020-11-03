package UsingJavaNet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class HttpURLConnectionPostExamble {

	public static void main(String[] args) throws IOException {

		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("POST");
	

		connection.setRequestProperty("Content-Type","application/json");
		connection.setDoOutput(true);

		String jsonBody = "{\"name\":\"Subramani\",\"salary\":\"12\",\"age\":\"15\"}";

		byte[] inputjson = jsonBody.getBytes();

		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputjson);


		int responseCode = connection.getResponseCode();
		System.out.println("Response Code Is " + responseCode);

		String responseMessage = connection.getResponseMessage();
		System.out.println("Response Message is " + responseMessage);

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String str = "";
		StringBuffer buffer = new StringBuffer();

		while ((str = bufferedReader.readLine()) != null) {
			buffer.append(str);
		}
		System.out.println(buffer);

		JSONObject jsonObject = new JSONObject(buffer.toString());

		System.out.println(jsonObject.get("status"));

		JSONObject jsonObject2 = new JSONObject(jsonObject.getJSONObject("data").toString());
		System.out.println(jsonObject2.getInt("id"));

	}

}
