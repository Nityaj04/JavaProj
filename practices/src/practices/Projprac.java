package practices;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Projprac {
	int calorie;
	int pizza=400;
	int burger=200;
	int soup=300;
	int ice=250;
	String name;
	
	public void caloriecal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your calorie");
		 
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
	
	public void welcome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		 
		 name = sc.next();
		 System.out.println("Welcome "+name+"!");
	}
	
	public void bank() {
	System.out.println("You have to make a payment for your bank");
	System.out.println("Do you need more details?");
	 
	 Scanner sc = new Scanner(System.in);
	 String ans = sc.next();
	 if(ans.equals("yes")) {
		 System.out.println("User name is your card number password is your petname followed by 123");
	 }
	 else
		 System.out.println("Good day!");
	 }
	public void calorieCalculator() {
		System.out.println("What did you ate today?");
		Scanner sc = new Scanner(System.in);
		 String array[]=new String[4];
		 for(int i = 0;i<array.length;i++) {
			 array[i] = sc.next();
		 if(array[i].equals("soup")) {
			 calorie=calorie+soup;
			 System.out.println(calorie);
		 }
		 else if(array[i].equals("burger")){
			 calorie=ice+burger;
			 System.out.println(calorie);
		 }
		 }
		 
		 
	}
		
	public static void main(String[] args) {
		Projprac obj = new Projprac();
		Date date=new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of week in number:"+dayOfWeek);
        String dayWeekText = new SimpleDateFormat("EEEE").format(date);
        System.out.println("Day of week in text:"+dayWeekText);               
		if(dayWeekText.equals("Thursday")){
			 System.out.println("1. You have to make payment to your bank!");
			 System.out.println("2. Calorie Calculator");
			 System.out.println("3. Registrations");
			 System.out.println("choose any option");
			 Scanner scanner = new Scanner(System.in);
			 int option = scanner.nextInt();
			 
			// if (option==1) {
				// obj.bank();
			 }
			 public void lesson() {
				System.out.println("Choose any one of the option below");
			 
			 System.out.println("a.Student ID "+" b.Remaining classes"+"Fees to pay");
			 
			// String details = scanner.next();
			 switch(details){
			 case "a":
				 System.out.println("Your ID is 23456");
				 break;
			 case "b":
				 System.out.println("You have ten classes to finidh this level");
				 break;
			 case "c":
				 System.out.println("You have to make a payment on this friday");
				 break;
			 }
			 }
			 
				//obj.welcome();
		//obj.calorieCalculator();
		//obj.bank();
		
		
	}
}



