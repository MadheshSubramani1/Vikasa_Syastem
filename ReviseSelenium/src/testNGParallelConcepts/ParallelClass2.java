package testNGParallelConcepts;

import org.testng.annotations.Test;

public class ParallelClass2 {
	@Test
	public void testCaseTwo() {

		System.out.println("This is Second Test Case " + Thread.currentThread().getId());

	}
}
