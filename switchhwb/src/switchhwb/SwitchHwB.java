package switchhwb;

import java.util.Scanner;

public class SwitchHwB {
	
	//Method1 starts here
	static void method1(String place) {		
		
	    //Start of switch statement
		switch(place) {
		case "Banff":
			System.out.println("You can visit Banff");
			break;
		case "Jasper":
			System.out.println("You can visit Jasper");
			break;
		default:
			System.out.println("You can visit Edmonton");
		}//end of switch statement	
	}//Method1 ends here
	
	//Method2 starts here
	static void method2(String season) {
		
	    //Beginning of switch statement
		switch(season) {
		case "Winter":
			System.out.println("Winter is here");
			break;
		case "Fall":
			System.out.println("Fall is here");
			break;
		default:
			System.out.println("Summer is here");
		}//End of switch statement
	}//Method2 ends here
	
	//main method
	public static void main(String[] args) {
			
		//for method1
		Scanner placeObj = new Scanner(System.in);//creating a scanner object
		System.out.println("Enter your favourite place: ");	//prompt for user input
		String place = placeObj.nextLine();//create a variable and store the input
		method1(place);//method call
			
		System.out.println("");
			
		//for method2
		Scanner seasonObj = new Scanner(System.in);	//creating a scanner object		
		System.out.println("Enter your favourite season: ");//prompt for user input			
		String season = seasonObj.nextLine();//create a variable and store the input	
		method2(season);//method call
			
		}
}

