package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(WebElement element) throws AWTException {

		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].style.border='7px red double'", element);
		String title=js.executeScript("return document.title;").toString();
		//return title;
		
		js.executeScript("arguments[0].click();", element);
		js.executeScript("alert('"+element+"')");
		js.executeScript("history.go(0)");
		js.executeScript("window.history.back();", "");
		js.executeScript("window.history.forward();","");
		js.executeScript("arguments[0].scrollIntoView();","");
		
		js.executeScript("window.scrollTo(o,document.body.scrollHeight)");
		js.executeScript("window.scollTo(document.body.scrollHeight,0)");
		
		
		js.executeScript("window.scroll(o,450)");
		js.executeScript("window.scoll(0,-450)");

		
		js.executeScript("window.scrollBy(o,450)");
		js.executeScript("window.scoll(0,0)");
		
		js.executeScript("arguments[0].value='madhesh';",element);
	
	}
	
	
}
