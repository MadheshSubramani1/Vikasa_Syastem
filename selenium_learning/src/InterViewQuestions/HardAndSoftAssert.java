package InterViewQuestions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssert {

	@Test
	public void hardAssert() {

		System.out.println("Open the Browser");
		System.out.println("Enter the Username");
		System.out.println("Enter the Password");
		System.out.println("Click the Login Button");
		System.out.println("Verify the Title");
		Assert.assertEquals("Madhesh", "Subramani");
		System.out.println("Verify the searh Box");

	}

	@Test
	public void softAssert() {

		SoftAssert softAssert = new SoftAssert();
		System.out.println("Open the Browser");
		System.out.println("Enter the Username");
		System.out.println("Enter the Password");
		System.out.println("Click the Login Button");
		System.out.println("Verify the Title");
		softAssert.assertEquals("Madhesh", "Subramani");
		System.out.println("Verify the searh Box");
		softAssert.assertAll();

	}

}
