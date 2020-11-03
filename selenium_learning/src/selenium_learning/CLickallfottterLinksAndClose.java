package selenium_learning;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLickallfottterLinksAndClose {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String parentWindow = driver.getWindowHandle();

		List<WebElement> list = driver.findElements(By.xpath("//div[text()='Make Money with Us']/following::ul[1]/li/a"));
		System.out.println(list.size());
		for (int i=0;i<list.size();i++) {

			String newtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			list.get(i).sendKeys(newtab);
		}
		
		 Set<String> allwindows=driver.getWindowHandles();
		 
		 for (String string : allwindows) { 
			 if(!string.equals(parentWindow)) {
		    driver.switchTo().window(string); 
		    driver.close(); } }
		 
	//driver.quit();
	}

}
