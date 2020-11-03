package InterViewQuestions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HowToMaximize {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions=new ChromeOptions();
		//chromeOptions.addArguments("start-maximized");
		//chromeOptions.addArguments("kiosk");
		chromeOptions.addArguments("window-size=1400,800");
		
		WebDriver driver =new ChromeDriver(chromeOptions);
		
		//driver.manage().window().maximize();
		
		//driver.manage().window().fullscreen();
		
		/*
		 * Dimension dimension=new Dimension(800, 200);
		 * driver.manage().window().setSize(dimension);
		 */
		
		driver.get("https://www.google.co.in");
	}

}
