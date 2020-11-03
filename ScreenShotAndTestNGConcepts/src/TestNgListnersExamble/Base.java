package TestNgListnersExamble;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Base {
	
	public static WebDriver driver;
	public void failed(String failedMethodName){
		
		try {
			TakesScreenshot scr = (TakesScreenshot) driver;
			File source = scr.getScreenshotAs(OutputType.FILE);
			File destination = new File("./"+failedMethodName+".png");
			FileUtils.copyFile(source, destination);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

}
}