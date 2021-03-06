package UsingJavaNet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionGETExample {

	public static void main(String[] args) throws IOException {

		URL url = new URL("http://dummy.restapiexample.com/api/v1/employees");

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("GET");


		int responseCode = connection.getResponseCode();
		System.out.println("Response Code is " + responseCode);

		String responeMessage = connection.getResponseMessage();

		System.out.println("Response Message " + responeMessage);

		InputStream inputstream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputstream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


		String str = "";

		StringBuffer stringBuffer = new StringBuffer();

		while ((str = bufferedReader.readLine()) != null) {

			stringBuffer.append(str);
		}
		System.out.println("using Looping " + stringBuffer);

	}

}
