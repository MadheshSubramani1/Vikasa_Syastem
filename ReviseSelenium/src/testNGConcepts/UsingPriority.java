package testNGConcepts;

import org.testng.annotations.Test;

public class UsingPriority {

	@Test(priority = 0)
	public void startTheCar() {

		System.out.println("Start The Car");
	}

	@Test(priority = 1)
	public void putFirstGear() {

		System.out.println("First Gear");
	}

	@Test(priority = 2)
	public void putSecondGear() {

		System.out.println("Second Gear");
	}

	@Test(priority = 3)
	public void putThirdGear() {

		System.out.println("Third Gear");
	}

	@Test(priority = 4, enabled = false)
	public void putFourthGear() {

		System.out.println("Fourth Gear");
	}

}
