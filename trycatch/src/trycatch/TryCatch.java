package trycatch;

public class TryCatch {

	public static void main(String[] args) {
		try {
			String[] colors = {"Blue", "Green", "Yellow"};
			System.out.println(colors[-1]);
		}
		catch (Exception e) {
			System.out.println("Check your code for error");
		}
		finally {
			System.out.println("The 'try catch' is finished");
		}
	}

}
