package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildingDetailsPageObjects {

	@FindBy(id = "btn_button")
	public static WebElement addNewBuildingButton;

	@FindBy(id = "txt_BuildingName")
	public static WebElement buildingName;

	@FindBy(id = "txt_BuildingAddress")
	public static WebElement buildingAddress;

	@FindBy(xpath = "//select[@name='Country' ][@id='ddl_BillType']")
	public static WebElement country;

	@FindBy(xpath = "//select[@name='cityID1' ][@id='ddl_BillType']")
	public static WebElement city;

	@FindBy(id = "ddl_BillType1")
	public static WebElement state;

	@FindBy(id = "txt_PhoneNumber")
	public static WebElement phoneNumber;

	@FindBy(id = "ddl_BuildinType")
	public static WebElement buildingType;

	@FindBy(id = "txt_ContactPersonName")
	public static WebElement contactPersonName;

	@FindBy(id = "txt_ContactPersonPhone")
	public static WebElement contactPersonPhoneNumber;

	@FindBy(id = "txt_ContactPersonEmail")
	public static WebElement contactPersonEmail;
	
	@FindBy(id="txt_NumberofFloors")
	public static WebElement numberOfFloors;
	
	@FindBy(id = "base1")
	public static WebElement NumberofBaseMents;

	@FindBy(id = "txt_TotalNumberofUnits")
	public static WebElement totalNumberofunits;

	@FindBy(id = "txt_UnitsPerFloor")
	public static WebElement numberofUnitsPerFloor;

	@FindBy(id = "txt_TotalBuildingArea")
	public static WebElement totalBuildingArea;

	@FindBy(id = "txt_YearBuilt")
	public static WebElement yearBuil;

	@FindBy(xpath = "//input[@type='file']")
	public static WebElement uploadbutton;

	@FindBy(id = "ddl_Entrance")
	public static WebElement entrance;
	@FindBy(xpath = " //button[@type='submit']")
	public static WebElement submit;

	@FindBy(xpath = "//span[@class='Validationlabels'][text()='* Please Fill Phone Number ']")
	public static WebElement pNErrorMsg;

	@FindBy(xpath = "//span[@class='Validationlabels'][text()='* Please Fill Contact Person Phone ']")
	public static WebElement cPNErrorMsg;

	@FindBy(xpath = "//span[@class='Validationlabels'][text()=' Invalid Email ']")
	public static WebElement cEmailErrormsg;
}
