package selenium_learning;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindows {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/Window.html");
		
		String ParentWindow=driver.getWindowHandle();
		
		WebElement FirstButton=driver.findElement(By.id("home"));
		FirstButton.click();
		
		Set<String> allWindow=driver.getWindowHandles();
		
		for (String newWindow : allWindow) {
			driver.switchTo().window(newWindow);
		}
		WebElement editButton=driver.findElement
				(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
		editButton.click();
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		
		  WebElement newWin=driver.findElement(
		 By.xpath("//button[text()='Open Multiple Windows']")); 
		 newWin.click();
		 
		 Set<String> childwindows=driver.getWindowHandles();
		 int totalWindowSize=childwindows.size();
		 System.out.println(totalWindowSize);
		 
		 for (String string : childwindows) {
			if(!ParentWindow.equals(string)) {
				driver.switchTo().window(string);
				driver.close();
			}
		}
		 
		
		

	}

}
