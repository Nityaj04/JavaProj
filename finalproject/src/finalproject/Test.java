package finalproject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
	Implementation imple;
	
	public String dayPlanner() {
		String dayWeekText;
	Date date=new Date();
    Calendar c = Calendar.getInstance();
    
    int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
    c.setTime(date);  
    dayWeekText = new SimpleDateFormat("EEEE").format(date);
    System.out.println("Today is "+dayWeekText);
    System.out.println(dayOfWeek +" th day of the week ");
    return dayWeekText;
	}
	
	 public static String date() {
		  
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String date = LocalDate.now().format(formatter);
		System.out.println(date);
		return date;	 
		
	 }
	
	public static void membership() {
				
		System.out.println("Today is: ");
		String today = date();
		System.out.println(" ");
		
		 String gymExpDate = "2021-11-27";
		 String primeExpDate = "2021-10-29";
		 String netflixExpDate = "2022-01-10";
		 String recreationExpDate = "2021-12-12";
		 
		LocalDate currentDate = LocalDate.parse(today);
		LocalDate gym = LocalDate.parse(gymExpDate);		
		LocalDate amazon = LocalDate.parse(primeExpDate);
		LocalDate netflix = LocalDate.parse(netflixExpDate);
		LocalDate rec = LocalDate.parse(recreationExpDate);
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please choose an option to know about expiry date of memberships");
		System.out.println(" ");
		System.out.println("gym-Gym Membership");
		System.out.println("amazon-Amazon Prime membership");
		System.out.println("netflix-Netflix membership");
		System.out.println("rec-Recreation Center membership");
		System.out.println(" ");
		
		String option = scan.nextLine();
		
		if(option.equals("gym")) {			
		long noOfDaysBetween = ChronoUnit.DAYS.between(currentDate, gym);		
		System.out.println(noOfDaysBetween+" days left");
		}
		
		else if(option.equals("amazon")) {			
		long noOfDaysBetween = ChronoUnit.DAYS.between(currentDate, amazon);
		System.out.println(noOfDaysBetween+ " days left");
		}
		
		else if(option.equals("netflix")) {			
			long noOfDaysBetween = ChronoUnit.DAYS.between(currentDate, netflix);
			System.out.println(noOfDaysBetween+ " days left");
			}
		
		if(option.equals("rec")) {			
			long noOfDaysBetween = ChronoUnit.DAYS.between(currentDate, rec);			
			System.out.println(noOfDaysBetween+" days left");
			}
		
		}
		
	
	public static void main(String[] args) {
	//	Test obj = new Test();
	//	String name = obj.dayPlanner();
	//  System.out.println(name);
		membership();
		
		
	}

}
