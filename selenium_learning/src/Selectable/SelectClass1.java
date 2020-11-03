package Selectable;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String[] Expected = { "Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov",
				"Dec" };

		WebElement month = driver.findElement(By.id("month"));
		Select select = new Select(month);

		String firstValue = select.getFirstSelectedOption().getText();
		System.out.println(firstValue);
		List<WebElement> AllValue = select.getOptions();
		
		assertEquals(AllValue.size(), 13);
		System.out.println("count verification Succes");
		
		for (int i = 0; i < AllValue.size(); i++) {
			String totalMonth = AllValue.get(i).getText();
			assertEquals(totalMonth, Expected[i]);

		}
		System.out.println("Text Verification Successful");
		driver.quit();
	}
}
