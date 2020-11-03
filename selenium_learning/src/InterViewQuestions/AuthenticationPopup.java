package InterViewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) throws AWTException {
		
	
		
		 WebDriver driver =new ChromeDriver();
		 
		// driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		 driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		
		StringSelection UserName=new StringSelection("admin");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(UserName, null);
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		StringSelection Password=new StringSelection("admin");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Password, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
			
		
	}

}
