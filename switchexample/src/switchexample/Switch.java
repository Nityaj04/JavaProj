package switchexample;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {//beginning of main method
		//Creating a scanner object
		Scanner myObj = new Scanner(System.in);
				
		//Output to prompt users for data
		System.out.println("Enter the place to want to visit: ");
		
		//Create a variable name 
		//Use the scanner object to receive input 
		String place = myObj.nextLine();
		
		switch(place) {
		case "USA":
			System.out.println("I want to visit USA");
			break;
		case "Japan":
			System.out.println("I want to visit Japan");
			break;
		case "China":
			System.out.println("I want to visit China");
			break;
		default:
		case "Canada":
			System.out.println("I like to visit Canada");	
			
		}			
	}//end of main method

}
