package exambleForTestNgGroups;

import org.testng.annotations.Test;

public class ExambleOfParallelExcecutinInTestNG {

	@Test
	public static void Test1() throws InterruptedException {
		
		for(int i=0; i<3 ;i++) {
			System.out.println("This is Test 1 "+Thread.currentThread().getId());
			Thread.sleep(50);
		}
	}
	
	@Test
	public static void Test2() throws InterruptedException {

		for (int i = 0; i <3; i++) {
			System.out.println("This is Test 2 "+Thread.currentThread().getId());
			Thread.sleep(50);
		}
		
	}	@Test
		public static void Test3() throws InterruptedException {

			for (int i = 0; i <3; i++) {
				System.out.println("This is Test 3 "+Thread.currentThread().getId());
			Thread.sleep(50);
			}
	}

}
