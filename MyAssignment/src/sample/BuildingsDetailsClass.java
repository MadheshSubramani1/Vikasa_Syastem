package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonFiles.CommonFunctions;
import pageObjects.BuildingDetailsPageObjects;

public class BuildingsDetailsClass extends CommonFunctions {


	public static synchronized void selectdropdown(WebElement e, int indexposition) {

		Select select = new Select(e);
		select.selectByIndex(indexposition);
		// return select;
	}

	@Test
	public static void Registration() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		PageFactory.initElements(driver, BuildingDetailsPageObjects.class);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn_button")));

		BuildingDetailsPageObjects.addNewBuildingButton.click();
		BuildingDetailsPageObjects.buildingName.sendKeys("Building");
		BuildingDetailsPageObjects.buildingAddress.sendKeys("Address");


		selectdropdown(BuildingDetailsPageObjects.country, 1);
		wait.until(ExpectedConditions.visibilityOf(BuildingDetailsPageObjects.country));
		selectdropdown(BuildingDetailsPageObjects.state, 1);
		wait.until(ExpectedConditions.visibilityOf(BuildingDetailsPageObjects.state));
		selectdropdown(BuildingDetailsPageObjects.city, 1);
		wait.until(ExpectedConditions.visibilityOf(BuildingDetailsPageObjects.city));


		BuildingDetailsPageObjects.phoneNumber.sendKeys("9042167769");


		String phoneNumber = BuildingDetailsPageObjects.phoneNumber.getAttribute("value");

		selectdropdown(BuildingDetailsPageObjects.buildingType, 1);
		BuildingDetailsPageObjects.contactPersonName.sendKeys("Madhesh");
		BuildingDetailsPageObjects.contactPersonPhoneNumber.sendKeys("9042167769");

		String cphoneNumber = BuildingDetailsPageObjects.contactPersonPhoneNumber.getAttribute("value");

		BuildingDetailsPageObjects.contactPersonEmail.sendKeys("test@gmail.com");
		BuildingDetailsPageObjects.numberOfFloors.sendKeys("5");
		BuildingDetailsPageObjects.NumberofBaseMents.click();
		BuildingDetailsPageObjects.totalNumberofunits.sendKeys("4");
		BuildingDetailsPageObjects.numberofUnitsPerFloor.sendKeys("5");
		BuildingDetailsPageObjects.totalBuildingArea.sendKeys("3");
		BuildingDetailsPageObjects.yearBuil.sendKeys("1");
		BuildingDetailsPageObjects.uploadbutton.sendKeys("C:\\Users\\VIKASA\\Downloads\\sample.jpg");
		selectdropdown(BuildingDetailsPageObjects.entrance, 1);
		BuildingDetailsPageObjects.submit.click();
		


				

		try {
			if (/* (BuildingDetailsPageObjects.pNErrorMsg.getSize()) != null || */phoneNumber.length() < 10) {
				System.out.println("Entered mobile Number is InValid");
			}
		} catch (Exception e) {
		}
		try {
			if ((BuildingDetailsPageObjects.cPNErrorMsg.getSize()) != null ||cphoneNumber.length()>10) {
				System.out.println("Entered Customer mobile Number is InValid");
			}
		} catch (Exception e) {
		}
		try {
			if ((BuildingDetailsPageObjects.cEmailErrormsg.getSize()) != null) {
				System.out.println("Entered Email ID is InValid");
			}
		} catch (Exception e) {
		}
		try {

			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='button'][text()='OK']")));
			WebElement alertbox = driver.findElement(By.xpath("//button[@type='button'][text()='OK']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", alertbox);
			

			System.out.println("All Enterd Details Are Correct");

		} catch (Exception e) {

		}

	}
}