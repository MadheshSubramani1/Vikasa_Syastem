package InterViewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class switchToActiveElement {
	static WebElement q;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		// driver.switchTo().activeElement().sendKeys("Mobiles \n");

		PageFactory.initElements(driver, switchToActiveElement.class);
		q.sendKeys("mobiles \n");

	}

}
