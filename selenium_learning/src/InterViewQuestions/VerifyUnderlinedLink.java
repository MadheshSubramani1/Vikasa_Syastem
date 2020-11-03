package InterViewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class VerifyUnderlinedLink {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.co.in/");

		WebElement gmailLink = driver.findElement(By.xpath("//a[text()='Gmail']"));

		String beforeHovering = gmailLink.getCssValue("text-decoration");
		System.out.println("Before Hovering - "+beforeHovering);

		Actions actions = new Actions(driver);
		actions.moveToElement(gmailLink).build().perform();
		
		String aftereHovering = gmailLink.getCssValue("text-decoration");
		System.out.println("After Hovering - "+aftereHovering);
		

	}

}
