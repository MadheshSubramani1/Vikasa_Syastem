package exambleForTestNgGroups;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExambleForParameters {

	@Test
	@Parameters("Name")
	public void UserName(String name) {
		System.out.println("User Name is "+name  );
	}
}
