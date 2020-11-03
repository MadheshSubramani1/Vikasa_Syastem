package commonFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunction {
	public static WebDriver driver;
	public static Properties properties;
	
	Logger logger=Logger.getLogger(CommonFunction.class);

	public Properties LoadPropertyFile() throws Exception  {

		FileInputStream Fi = new FileInputStream("config.properties");

		properties = new Properties();
		properties.load(Fi);
		return properties;
	}

	@BeforeSuite
	public void launchBrowser() throws Exception{
        PropertyConfigurator.configure("log4J.properties");
        logger.info("Orange HRM Test Begins");
        logger.info("Loading The Property File");
		LoadPropertyFile();
		String browser = properties.getProperty("browser");
		String driverLocation = properties.getProperty("driverLocation");
		String url = properties.getProperty("url");

		if (browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", driverLocation);
			logger.info("Launching Chrome Browser");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			logger.info("Lanuching FireBox Browser");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Navigating to Application");
		driver.get(url);

	}

	@AfterSuite
	public void tearDown() {
		
		logger.info("Execution ompleted");
		driver.quit();
	}
}