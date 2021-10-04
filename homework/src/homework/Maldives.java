package homework;

import java.util.Scanner;

public class Maldives extends LuxuryVacation {	
	
		public static void main(String[] args) {
			//object creation
			Maldives obj = new Maldives();
			
			//calling superclass methods
			obj.LuxuryExcursion("Elite JetSetters");		
			obj.excursionPlace("Maldives");
			
			//Accessing superclass variable
			System.out.println(obj.excursionOne+" is a beautiful place!");
			
			//scanner object
			Scanner scanner = new Scanner(System.in);
			System.out.println("Do you like swimming?");
			String answer = scanner.nextLine();
			
		 //if loop to prompt user interest
		 if(answer.equals("yes")) {
			System.out.println("Great! We are offering scuba diving");
		 }
		 else {
			System.out.println("No problem! There is a yacht party, join and enjoy the party!");
		 }	
		   //calling superclass method
		 	obj.greetings();
		
	}

}
