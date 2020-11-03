package JavaInterviewQuestions;

public class SwapTwoNumbers {

	public static void withThirdParty() {

		int Mysalary = 10;
		int coordinatorSalary = 20;

		System.out.println("Before Swapping - My salary " + Mysalary + " Coordinator salary " + coordinatorSalary);
		int temp = Mysalary;
		Mysalary = coordinatorSalary;
		coordinatorSalary = temp;
		System.out.println("After Swapping - My salary " + Mysalary + " Coordinator salary " + coordinatorSalary);
	}

	public static void withOutThirdParty() {
		int Mysalary = 20;
		int coordinatorSalary = 10;

		System.out.println("Before Swapping - My salary " + Mysalary + " Coordinator salary " + coordinatorSalary);
		Mysalary=Mysalary+coordinatorSalary;
		coordinatorSalary=Mysalary-coordinatorSalary;
		Mysalary=Mysalary-coordinatorSalary;
		System.out.println("After Swapping - My salary " + Mysalary + " Coordinator salary " + coordinatorSalary);
		
	}
	public static void main(String[] args) {
		//withThirdParty();
		withOutThirdParty();
	}

}
