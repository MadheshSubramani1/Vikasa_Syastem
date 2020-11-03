package exambleForTestNgGroups;

import org.testng.annotations.Test;

public class ExambleOfTestNgGroup {

	@Test(groups = "Vivo")
	public void Vivo1() {

		System.out.println("This is Vivo1 ");
	}

	@Test(groups = "Vivo")
	public void Vivo2() {
		System.out.println("This is Vivo2 ");
	}

	@Test(groups = "Moto")
	public void Moto1() {
		System.out.println("This is  Moto1");
	}

	@Test(groups = "Moto")
	public void Moto2() {
		System.out.println("This is  Moto2");
	}

	@Test(groups = "Lenovo")
	public void Lenovo1() {
		System.out.println("This is Lenovo1");
	}

	@Test(groups = "Lenovo")
	public void Lenovo2() {
		System.out.println("This is Lenovo2 ");
	}

	@Test(groups = "iphone")
	public void iPhone1() {
		System.out.println("This is iPhone1");
	}

	@Test(groups = "iphone")
	public void iPhone2() {
		System.out.println("This is iPhone2 ");
	}

}
