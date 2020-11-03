package InterViewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class sendKeys {

	public static void main(String[] args) throws AWTException {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		/*
		 * StringSelection selection=new StringSelection("salem");
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,
		 * null);
		 * 
		 * Robot robot=new Robot(); robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 */

		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_S);
		 * robot.keyRelease(KeyEvent.VK_S); robot.keyPress(KeyEvent.VK_A);
		 * robot.keyRelease(KeyEvent.VK_A);
		 */

		WebElement searchBox = driver.findElement(By.name("q"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("document.getElementsByName('q')[0].value='salem';", "");
		js.executeScript("arguments[0].value='salem'", searchBox);
	}

}
