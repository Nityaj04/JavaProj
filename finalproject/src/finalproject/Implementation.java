package finalproject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Implementation implements PrivateDetails {
	String dayWeekText;
	 Scanner scan = new Scanner(System.in);
	 Implementation imple = new Implementation();
	
	 public String date() {
		 Calendar c = Calendar.getInstance();
		 Date today = c.getTime();
		 DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
         String strDate = dateFormat.format(today);  
		 return strDate;
	 }
	
	public String dayPlanner() {
		Date date=new Date();
	    Calendar c = Calendar.getInstance();
	    
	    int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
	    c.setTime(date);  
	    dayWeekText = new SimpleDateFormat("EEEE").format(date);
	    System.out.println("Today is "+dayWeekText);
	    System.out.println(dayOfWeek +" th day of the week ");
	    return dayWeekText;
		}

	public void lesson() {
		
	 System.out.println("You have a piano lesson today");
	 System.out.println("Select any of the option below");
		 
	 System.out.println("a.Student ID "+" b.Remaining classes"+"Fees to pay");
	 
	
	 String details = scan.next();
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

	@Override
	public void membership() {
		String ret = imple.date();
		
		 String gymExpDate = "2021-11-24";
		 String musicExpDate = "2021-11-29";
		 
		 LocalDate exp = LocalDate.parse(ret);
		LocalDate exp1 = LocalDate.parse(gymExpDate);
		
		LocalDate exp2 = LocalDate.parse(musicExpDate);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select an option");
		System.out.println("Gym");
		System.out.println("Music");
		
		String option = scan.next();
		
		if(option.equals("Gym")) {
			
		long noOfDaysBetween = ChronoUnit.DAYS.between(exp1, exp);
		
		System.out.println(noOfDaysBetween);
		}
		else if(option.equals("Music")) {
			
		long noOfDaysBetween = ChronoUnit.DAYS.between(exp2, exp);
		
		System.out.println(noOfDaysBetween);
		}
		
	}
		
		
		
	}

