package mavenPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testClass {

	
	@Test
	public void url() {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.close();
	}
}
