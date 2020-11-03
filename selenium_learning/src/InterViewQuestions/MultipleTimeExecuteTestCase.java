package InterViewQuestions;

import org.openqa.selenium.TimeoutException;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class MultipleTimeExecuteTestCase {

	
	/*
	 * @Test(invocationCount=20) public static void test() throws
	 * InterruptedException { System.out.println("Hello"); }
	 */
	/*
	 * @Test(timeOut = 2000) public static void test1() throws InterruptedException
	 * { Thread.sleep(3000); System.out.println("Hello"); }
	 */
	
	
	
	//Here we can handle the Exception
	@Test(timeOut = 2000,expectedExceptions = ThreadTimeoutException.class)
	public static void test1() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Hello");
	}

}
