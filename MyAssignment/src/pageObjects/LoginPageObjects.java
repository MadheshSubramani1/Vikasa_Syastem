package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	@FindBy(id = "ddl_LoginLanguageName")
	public static WebElement userType;

	@FindBy(id = "txt_LoginUserName")
	public static WebElement username;

	@FindBy(id = "txt_Loginuserpassword")
	public static WebElement password;

	@FindBy(id = "btn_Loginbutton")
	public static WebElement loginButton;

}

