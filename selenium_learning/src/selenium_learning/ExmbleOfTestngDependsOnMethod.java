package selenium_learning;

import org.testng.annotations.Test;

public class ExmbleOfTestngDependsOnMethod {

	@Test(enabled = false)
	public static void Studied_highSchool() {

		System.out.println("Studied 10 std");
	}

	@Test(dependsOnMethods = "Studied_highSchool")
	public static void Studied_higher_Secondary() {

		System.out.println("Studied 12 std");
	}

	@Test(dependsOnMethods = "Studied_higher_Secondary")
	public static void Studied_College() {

		System.out.println("Studied College");
	}

}
