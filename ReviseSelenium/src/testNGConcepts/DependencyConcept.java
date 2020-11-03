package testNGConcepts;

import org.testng.annotations.Test;

public class DependencyConcept {

	@Test(enabled = true)
	public void highSchool() {

		System.out.println("High School");

	}

	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("Highe sec School");

	}

	@Test(dependsOnMethods = "higherSecondary")
	public void college() {

		System.out.println("Engineering");
	}

}