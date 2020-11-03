package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class SampleTest {

	static WebDriver driver;
	static int i = 1;
	static String paths = "C:\\Users\\VIKASA\\eclipse-workspace\\ReviseSelenium\\src\\DataDriven\\Login data.xls";

	@BeforeTest
	public static void launchTheBrowser() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	public static String[][] getExcelData() throws BiffException, IOException {

		FileInputStream inputStream = new FileInputStream(paths);

		Workbook workbook = Workbook.getWorkbook(inputStream);
		Sheet sheet = workbook.getSheet(0);
		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();

		String[][] excelData = new String[rowCount - 1][columnCount];

		TestClass.CreateStatusColumn(paths, "Sheet1", "Status");
		for (int i = 1; i < rowCount; i++) {

			for (int j = 0; j < columnCount; j++) {

				excelData[i - 1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return excelData;
	}

	@DataProvider(name = "loginData")
	public static String[][] logindata() throws BiffException, IOException {
		String[][] data = getExcelData();
		return data;
	}

	@Test(dataProvider = "loginData")
	public static void CRM_LOGIN(String uname, String pwd) throws IOException {

		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
        driver.findElement(By.id("btnLogin")).click();


		if (driver.findElements(By.xpath("//*[@id='MP_link']")).size() != 0) {
			TestClass.setCellData("Sheet1", "Status", i, "Pass", paths);
			i = i + 1;
        }else {
			TestClass.setCellData("Sheet1", "Status", i, "Fail", paths);
			i = i + 1;
        }

	}

	@AfterTest
	public static void tearDown() {
		driver.quit();
	}
}