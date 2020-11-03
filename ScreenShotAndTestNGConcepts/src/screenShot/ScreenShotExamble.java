package screenShot;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExamble {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(source, new File("./screenshot.png"));
		
		FileHandler.copy(source, new File("./screenshot.png"));
	}

}
