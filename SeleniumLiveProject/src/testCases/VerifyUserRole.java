package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFiles.CommonFunction;
import pageObjects.userRolePageObjects;

public class VerifyUserRole extends CommonFunction {
	Logger logger=Logger.getLogger(VerifyUserRole.class);
	public void moveToUsers() {
		logger.info("Move to Users Page");
		PageFactory.initElements(driver, userRolePageObjects.class);
		Actions actions = new Actions(CommonFunction.driver);
		actions.moveToElement(userRolePageObjects.adminLink);
		actions.moveToElement(userRolePageObjects.userManagementLink);
		actions.moveToElement(userRolePageObjects.usersLink).click();
		actions.build().perform();
	}

	public void selectUserRoleAndStatus() {
		PageFactory.initElements(driver, userRolePageObjects.class);
		logger.info("Selecting The User Role");
		Select userRole = new Select(userRolePageObjects.userRole);
		userRole.selectByIndex(1);
		logger.info("Selecting The User Status");
		Select userStatus = new Select(userRolePageObjects.userStaus);
		userStatus.selectByIndex(1);
		userRolePageObjects.searchButton.click();

	}

	@Test
	public void VerifyUserRolesandStatus() {

		
		moveToUsers();

		selectUserRoleAndStatus();
		
		PageFactory.initElements(driver, userRolePageObjects.class);
		
		String ActualUserRole = userRolePageObjects.UserRoleValue.getText();
		String ActualUserStaus = userRolePageObjects.UserStatusValue.getText();
		logger.info("Verifying The User Role And Status");
		Assert.assertEquals(ActualUserRole, "Admin");
		Assert.assertEquals(ActualUserStaus, "Enabled");

	}
}
