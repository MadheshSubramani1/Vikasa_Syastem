package TestCase;

	import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonFiles.CommonFunctions;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import pageObjects.LoginPageObjects;

	public class VerifyLoginPage extends CommonFunctions {
		int i = 1;
		static String paths = "C:\\Users\\VIKASA\\git\\Assignmet1\\MyAssignment\\login.xls";

		public static String[][] getExcelData() throws BiffException, IOException {

			FileInputStream inputStream = new FileInputStream(paths);

			Workbook workbook = Workbook.getWorkbook(inputStream);
			Sheet sheet = workbook.getSheet(0);
			int rowCount = sheet.getRows();
			int columnCount = sheet.getColumns();

			String[][] excelData = new String[rowCount - 1][columnCount];

			for (int i = 1; i < rowCount; i++) {

				for (int j = 0; j < columnCount; j++) {

					excelData[i - 1][j] = sheet.getCell(j, i).getContents();
				}
			}
		// DataDrivenUtilities.CreateColumnHeader(paths, "Sheet1", "Status");
			return excelData;
		}

		@DataProvider(name = "loginData")
		public static String[][] logindata() throws BiffException, IOException {
			String[][] data = getExcelData();
			return data;
		}

		@Test(dataProvider = "loginData")
		public void Login(String username, String Password) throws IOException {
			PageFactory.initElements(driver, LoginPageObjects.class);
			LoginPageObjects.userType.sendKeys("Users");
			LoginPageObjects.username.sendKeys(username);
			LoginPageObjects.password.sendKeys(Password);
			LoginPageObjects.loginButton.click();
		/*
		 * if (driver.findElements(By.linkText("Buildings")).size() != 0) {
		 * DataDrivenUtilities.setCellData("Sheet1", "Status", i, "Pass", paths); i = i
		 * + 1; } else { LoginPageObjects.username.clear();
		 * LoginPageObjects.password.clear(); DataDrivenUtilities.setCellData("Sheet1",
		 * "Status", i, "Fail", paths); i = i + 1; }
		 */
		}

}
