package TestNgListnersExamble;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestClass extends Base {
	@BeforeSuite
	public void setUP() {
		driver = new ChromeDriver();

	}

	@Test
	public void verifyGoogleTitle() {

		driver.get("https://www.google.com/");

		Assert.assertEquals(true, false);

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
