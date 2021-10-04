package firstexample;

import java.util.Scanner;

public class ClassExample {

	public static void main(String[] args) {
		//Creating a scanner object
		Scanner pensionObj = new Scanner(System.in);
		Scanner pensionObj1 = new Scanner(System.in);
		
		//Output to prompt users for data
		System.out.println("Enter your age: ");
		System.out.println("Enter your name: ");
		
		//Create a variable name 
		//Use the scanner object to receive input 
		int age = pensionObj.nextInt();
		String name = pensionObj1.nextLine();
		
		System.out.println("Your name is: "+ name);
		System.out.println("Your age is: "+ age);
		
		/*Validating the condition
		if(age<65) {
			System.out.println("You are young");
		}
		else
		{
			System.out.println("You have pension benefits");
		}*/
		
				
	}//end of main method

}
