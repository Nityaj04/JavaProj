package finalproject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalorieCalculator extends Implementation {
	int id = 12345;
	
	public String welcome(String name) {
		return name;
	}
	
	public void bank() {
	System.out.println("You have to make a payment for your bank");
	System.out.println("Do you need more details?");
	 
	 Scanner sc = new Scanner(System.in);
	 String ans = sc.next();
	 if(ans.equals("yes")) {
		 CalorieCalculator obj = new CalorieCalculator();
		 String name = obj.welcome("Nithya");
		 System.out.println("Welcome" + name);
		
	 }
	 else
		 System.out.println("Good day!");
	 }


	String dayWeekText;
	public void caloriecal() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many calorie");
		 
		int cal= sc.nextInt();
		System.out.println();
		
		if(cal==6) {
			System.out.println("Kick box-30 mins");
			
		}
		else if(cal==5) {
			System.out.println("walking 10mins");
			System.out.println("jogging 10mins");
		}
		else
		System.out.println("walking 30mins");
	}
	
	public void calorieCalculator() {
		//Upcasting
		
		final int calorie = 1800;
		
		int foodNumber=1, tot=0, temp =0, diff=0;
		
		do {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the food number");
		System.out.println("1.Pizza");
		System.out.println("2.Hamburger");
		System.out.println("3.Fries");
		System.out.println("4.Exit");
		
		foodNumber= sc.nextInt();
		if(foodNumber==4) {
		System.out.println("Thank you");
		break;
		}
		else {
		System.out.println("Enter the quantity");
		int quan = sc.nextInt();				
		if(foodNumber==1) { 
			tot=1*quan;
			System.out.println(tot);
		}	      
		else if(foodNumber==2) {	
			tot=2*quan;
			System.out.println(tot);
		}
		else if(foodNumber==3) {
			tot=3*quan;
			System.out.println(tot);         
		}
		
		System.out.println("Your total is "+tot);
		temp=tot+temp;
		System.out.println("Your totalcost is "+temp);
		diff = temp-calorie;
		
		System.out.println("Your have eaten "+ Math.abs(diff));
		
		}
		
		 }while(foodNumber>4);
		
		
		
		}
	
	
		
		
	}


