package commonFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {

	public static WebDriver driver;
	public static Properties properties;

	public static Properties loadPropertyFile() throws IOException {

		FileInputStream fi = new FileInputStream("config.properties");

		properties = new Properties();

		properties.load(fi);
		return properties;
	}

	@BeforeSuite
	public void launchTheBrowser() throws Exception {
		loadPropertyFile();
		String browser = properties.getProperty("browser");
		String driverLocation = properties.getProperty("driverLocation");
		String url = properties.getProperty("url");

		if (browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(10, unit)
		driver.get(url);

	}

	@AfterSuite
	public void tearDown() {

		// driver.quit();
	}

}

