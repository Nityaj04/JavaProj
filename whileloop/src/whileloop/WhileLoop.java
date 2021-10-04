package whileloop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {//beginning of main method
		//Create a scanner object
		Scanner obj = new Scanner (System.in);
		
		//Output to prompt users for data
		System.out.println("Enter your favorite movie name: ");
		
		//create a variable to store user input
		String movieName = obj.nextLine();
		
		//While loop starts here
		//starting point
		int i = 0;
		
		//condition
		while (i<10)
			
		//action
		{
			System.out.println(movieName);
		//increment	
			i++;
		}
		
		}//end of main method

}
