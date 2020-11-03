package InterViewQuestions;

import org.testng.annotations.Test;

public class alwaysRun {

	@Test(timeOut = 2000)
	public void loginTest() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("THis is Login Method");
	}

	@Test(dependsOnMethods = "loginTest", alwaysRun = true)
	public void VerifyTitle() {

		System.out.println("THis is Login Method");
	}


}
