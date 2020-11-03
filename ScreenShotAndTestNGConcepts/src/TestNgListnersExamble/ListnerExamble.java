package TestNgListnersExamble;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerExamble extends Base implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println("TestCase is going to Execute and name is  " + result.getName());

	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Test is Passed and Name is " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
	
			failed(result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		System.out.println("Before Everything");
	}

	public void onFinish(ITestContext context) {
		System.out.println("After Everything");
	}

}
