package InterViewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class checkAlltheCheckBoxes {

	public static void main(String[] args) {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");

		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement allCheckBoxes : checkBoxes) {
			allCheckBoxes.click();
		}
	}

}
