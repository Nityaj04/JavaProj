package switchexample;

import java.util.Scanner;

public class Switchint {
	  public static void main(String[] args) {//beginning of main method
		
		//Creating a scanner object
		Scanner obj = new Scanner(System.in);
						
		//Output to prompt users for data
		System.out.println("Enter the place amount: ");
				
		//Create a variable name 
		//Use the scanner object to receive input 
		int amount = obj.nextInt();
		
		//beginning of switch 
		switch(amount) {
		case 10000:
			System.out.println("I can visit USA");
			break;
		case 20000:
			System.out.println("I can visit Australia");
			break;
		case 15000:
			System.out.println("I can visit India");
			break;
		default:
			System.out.println("I can visit Canada");	
			
	}//end of switch 
	}//end of main method

}