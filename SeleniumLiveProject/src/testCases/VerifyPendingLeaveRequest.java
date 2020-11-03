package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFiles.CommonFunction;
import pageObjects.loginpageObjects;
import pageObjects.pendinLeaveRequestPageObjects;

public class VerifyPendingLeaveRequest extends CommonFunction
{
	String ActualMessage;
	Logger logger=Logger.getLogger(VerifyPendingLeaveRequest.class);
	public void login() {
		logger.info("Login The Application");
		PageFactory.initElements(driver, loginpageObjects.class);
		loginpageObjects.username.sendKeys(properties.getProperty("username"));
		loginpageObjects.password.sendKeys(properties.getProperty("password"));
		loginpageObjects.loginButton.click();
	}
	
	public void getPendingLeaveRequest() {
		logger.info("Getting The Pending Leave Request");
		PageFactory.initElements(driver, pendinLeaveRequestPageObjects.class);
		 ActualMessage=pendinLeaveRequestPageObjects.pendingLeaveRequests.getText();
	}

	@Test
	public void verifyPendingLeaves() {
		
		login();
		getPendingLeaveRequest();
		logger.info("Verifying The Pending Leave request");
		Assert.assertEquals(ActualMessage, "No Records are Available");
	}
	
}
