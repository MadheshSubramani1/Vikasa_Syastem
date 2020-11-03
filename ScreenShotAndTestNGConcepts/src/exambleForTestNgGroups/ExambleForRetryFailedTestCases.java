package exambleForTestNgGroups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExambleForRetryFailedTestCases {

	@Test
	public void Method1() {
		
		Assert.assertEquals(true, false);

	}

	@Test
	public void Method2() {

		Assert.assertEquals(true, false);

	}
}
