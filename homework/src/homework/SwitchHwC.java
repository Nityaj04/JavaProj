package homework;

import java.util.Scanner;

public class SwitchHwC {

	//Method1 starts here
	static void method1(String place) {	//Start of switch statement		
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
	static void method2(int points) {
			
		//Beginning of switch statement
			switch(points) {
			case 1000:
				System.out.println("You have earned 1000 points");
				break;
			case 2000:
				System.out.println("You have earned 2000 points");
				break;
			default:
				System.out.println("You have earned 5000 points");
			}//End of switch statement
		}//Method2 ends here
		
	//main method
	public static void main(String[] args) {				
		//for method1
		Scanner placeObj = new Scanner(System.in);//creating a scanner object
		System.out.println("Enter your favourite place: ");	//prompt for user input
		String favPlace = placeObj.nextLine();//create a variable and store the input
		method1(favPlace);//method call
				
		System.out.println("");
				
		//for method2
		Scanner seasonObj = new Scanner(System.in);	//creating a scanner object		
		System.out.println("Enter your number: ");	//prompt for user input		
		int number = seasonObj.nextInt(); //create a variable and store the input	
		method2(number);//method call
				
			}
	}
