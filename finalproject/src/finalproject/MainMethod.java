package finalproject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MainMethod {
	
	public static void main(String[] args) {
		int option=0, i=0;
		Implementation calObj;
		String day = calObj.dayPlanner();
	
	
		do{
			 
		if(day.equals("Sunday")){
			 System.out.println("===============================================");
			 System.out.println("Here is the today's schedule, Choose one of the options below");
			 System.out.println("1. Bank payment");
			 System.out.println("2. Calorie Calculator");
			 System.out.println("3. Membership");
			 System.out.println("4. Lessons");
			 System.out.println("5. Exit");
			 System.out.println("===============================================");
			 
			 Scanner scanner = new Scanner(System.in);
			 option = scanner.nextInt();
			 System.out.println("Your choice is " + option);
			 
			
			 if (option==1) {
				 calObj = new CalorieCalculator();
				  calObj.bank();
			 }
			 else if(option==2) {
				 calObj = new CalorieCalculator();
				 calObj.calorieCalculator();
				 
			 }
			 else if(option==3) {
				 calObj = new CalorieCalculator();
				 calObj.membership();
			 }
			 else if(option==4) {
				 calObj = new CalorieCalculator();
				 calObj.lesson();
			 }
			 if(option==5) {
				 System.out.println("Thank you!");
				 break;
			}
			 }
		}while (i<=4);
	
	}
}
