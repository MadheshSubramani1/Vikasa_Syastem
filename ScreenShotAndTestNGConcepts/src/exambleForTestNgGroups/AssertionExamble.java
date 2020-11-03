package exambleForTestNgGroups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExamble {

	@Test
	public static void sample() {

		
		String myName="Madhesh Subramani";
		
		boolean value=false;
		
		
		Assert.assertEquals(myName, "Madhesh Subramani");
		Assert.assertNotEquals(myName, "madhesh subramani");
		
		Assert.assertFalse(value, "Value is Not Equal");
		//Assert.assertTrue(value, "Value is Not Equal");
	}

}
