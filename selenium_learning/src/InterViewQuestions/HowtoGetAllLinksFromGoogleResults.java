package InterViewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowtoGetAllLinksFromGoogleResults {

	public static void main(String[] args) {
	
		
		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("tamil dubbed  download \n");
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='rso']//following::h3"));
		System.out.println(list.size());
		for(WebElement webElement:list) {
			System.out.println(webElement.getText());
		}
		
		
		

	}

}
