package homework;

import java.util.Scanner;

public class Bali extends LuxuryVacation {	
		
		public static void main(String[] args) {
				
			    //object creation
				Bali obj = new Bali();
				
				//calling superclass methods
				obj.LuxuryExcursion("Elite JetSetters");					
				obj.excursionPlace("Bali");
								
				//accessing superclass variable 
			System.out.println(obj.excursionTwo+" is a wounderful place!");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Do you like playing with monkeys?");
			String choiceInput = scanner.next();
			
			//if loop to prompt user interest
			if(choiceInput.equals("yes") ){
				System.out.println("Great! You will have a wounderful experience in a monkey forest!");
			}
			else {
				System.out.println("No problem! You will have a beach party at Kuta beach!");
			}
			
			//calling superclass method
			obj.greetings();
		}
			
			
	}


