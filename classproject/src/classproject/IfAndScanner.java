package classproject;

import java.util.Scanner;

public class IfAndScanner {
	
	static void MethodExample(String flower) {
		
		if (flower.equals("Rose")) {//Start of if loop
		//executes if true
		System.out.println("I like "+ flower);
	}
	else
		//executes if false
	{
		System.out.println(flower + " is a beautiful flower");
	}//end of if loop
	}
	public static void main(String[] args) {
		//Create a scanner object
		Scanner obj = new Scanner (System.in);
				
		//Output to prompt users for data
		System.out.println("What is your favorite flower? ");
				
		//create a variable to store user input
		String text = obj.nextLine();
		
		//method call
		MethodExample(text);
				
	}

}
