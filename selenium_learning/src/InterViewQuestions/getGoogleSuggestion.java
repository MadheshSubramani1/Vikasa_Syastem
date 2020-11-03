package InterViewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class getGoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("mobiles");

		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));

		int position = 0;
		for (WebElement webElement : suggestions) {

			String text = webElement.getText();

			System.out.println(text);

			position = position + 1;
			
			if (position == 1) {
				webElement.click();
				break;
			}

		}

		/*
		 * for (WebElement webElement : suggestions) {
		 * 
		 * String text = webElement.getText();
		 * 
		 * System.out.println(text);
		 * 
		 * if (text.equals("mobiles under 5000")) {
		 * 
		 * webElement.click(); break; } }
		 */

		/*
		 * Actions actions=new Actions(driver);
		 * 
		 * actions.sendKeys(searchBox,"mobiles").build().perform(); Thread.sleep(2000);
		 * actions.sendKeys(searchBox,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build(
		 * ).perform();
		 */

		// driver.quit();
	}

}
