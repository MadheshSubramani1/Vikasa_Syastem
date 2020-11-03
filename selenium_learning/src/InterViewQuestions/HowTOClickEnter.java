package InterViewQuestions;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowTOClickEnter {

	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.facebook.com/");

		/*
		 * driver.findElement(By.id("email")).sendKeys("9042167769");
		 * driver.findElement(By.id("pass")).sendKeys("9042167769Madhesh \n");
		 */

		/*
		 * WebElement email=driver.findElement(By.id("email"));
		 * email.sendKeys("9042167769"); WebElement
		 * password=driver.findElement(By.id("pass"));
		 * password.sendKeys("9042167769Madhesh"); password.submit();
		 */

		/*
		 * WebElement email=driver.findElement(By.id("email"));
		 * email.sendKeys("9042167769"); WebElement
		 * password=driver.findElement(By.id("pass"));
		 * password.sendKeys("9042167769Madhesh", Keys.ENTER);
		 */

		/*
		 * WebElement email=driver.findElement(By.id("email"));
		 * email.sendKeys("9042167769"); WebElement
		 * password=driver.findElement(By.id("pass"));
		 * password.sendKeys("9042167769Madhesh"+Keys.ENTER);
		 */

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("9042167769");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("9042167769Madhesh");

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
