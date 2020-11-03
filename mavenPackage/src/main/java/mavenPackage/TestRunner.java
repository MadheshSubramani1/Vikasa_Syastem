package mavenPackage;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {
public static TestNG testNG;
	
	public static void main(String[] args) {
		
		testNG=new TestNG();
		
		
		List<String> suitePath=new ArrayList<String>();
		
		//suitePath.add(System.getProperty("user.dir")+"\\first.xml");
		suitePath.add("C:\\Users\\VIKASA\\eclipse-workspace\\mavenPackage\\youTube.xml");
		
		
		testNG.setTestSuites(suitePath);
		
		testNG.run();

}
}