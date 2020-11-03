package seleniumWaitExamble;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;


public class FluentWaitExamble {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.phptravels.net/login");

		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[3]/div[1]/label/input")).sendKeys("user@phptravels.com");
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[3]/div[2]/label/input")).sendKeys("demouser");
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();

		/*
		 * WebDriverWait wait = new WebDriverWait(driver,20); WebElement myProfile=
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath
		 * ("/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"
		 * )));
		 * 
		 * myProfile.click();
		 */
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement profile=wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath
						("/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"));
			}
		} );
		
		profile.click();
		 
		

		

	}
}
