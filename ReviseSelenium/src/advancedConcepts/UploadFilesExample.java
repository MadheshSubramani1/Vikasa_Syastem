package advancedConcepts;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFilesExample {

	public static void main(String[] args) throws AWTException, InterruptedException {


		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/upload.html");

		WebElement uploadButton = driver.findElement(By.name("filename"));

		uploadButton.sendKeys("C:\\Users\\VIKASA\\Downloads\\testleaf.txt");
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor) driver;
		 * executor.executeScript("arguments[0].click()", uploadButton);
		 * 
		 * StringSelection selction = new
		 * StringSelection("C:\\Users\\VIKASA\\Downloads\\testleaf.txt");
		 * 
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selction, null);
		 * 
		 * Robot robot = new Robot();
		 * 
		 * robot.delay(500); robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_CONTROL);
		 * 
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 */

		WebElement upButton = driver.findElement(By.name("filename"));

		WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.attributeToBeNotEmpty(upButton, "value"));
		wait.until(ExpectedConditions.attributeContains(upButton, "value", "testleaf.txt"));

		String value = upButton.getAttribute("value");
		System.out.println(value);

		if (value.contains("testleaf.txt")) {
			System.out.println("file is uploaded successfully");
		} else {
			System.out.println("file is not uploaded");
		}
		driver.quit();
	}

}
