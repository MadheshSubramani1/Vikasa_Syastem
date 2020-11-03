package InterViewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToRefresh {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		WebDriver driver=new ChromeDriver();

		driver.navigate().to("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Hello");

		
		
		//driver.get(driver.getCurrentUrl());
		
		//driver.navigate().refresh();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		
		//js.executeScript("location.reload()");
		js.executeScript("history.go()");
		
		/*
		 * Robot robot=new Robot();
		 * 
		 * robot.keyPress(KeyEvent.VK_F5); robot.keyRelease(KeyEvent.VK_F5);
		 */
		
		
	}

}
