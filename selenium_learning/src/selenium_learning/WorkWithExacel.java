package selenium_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkWithExacel {

	@Test
	public static void loginPage() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("madhesh");

		WebElement Password = driver.findElement(By.id("txtPassword"));
		Password.sendKeys("9042167769");

		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		

	 }

}
