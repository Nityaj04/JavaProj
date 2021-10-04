package oops;

import java.util.Scanner;

public class Olympics {
	
	//Creating global variables
	public String name;
	public int energyLevel;
	public String sport;
	
	//Creating constructor to initialize the name variable
	public Olympics(String name) {
		this.name = name;
	}
	
	//Creating level method and initializing the level variable
	public void level(int l) {
		energyLevel = l;
	}	
	//Creating sport method and initializing the sport variable
	public void sport(String s) {
		sport = s;
	}	
	//Creating print method
	public void printMethod() {
		System.out.println("The athelete name is: " + name);
		System.out.println("His enerylevel is: " + energyLevel);
		System.out.println("The sport is: "+ sport);
	}
	public static void main(String[] args) {
		//Creating a scanner object
		Scanner scanner = new Scanner(System.in);		
		//prompting user for input
		System.out.println("Enter the athelete name: ");		
		//storing user input in a variable
		String athName = scanner.nextLine();
		
		System.out.println("Enter the athelete enerylevel: ");			
		int athEL = scanner.nextInt();
		
		scanner.nextLine();
				
		System.out.println("Enter the sport name: ");	
		String sport = scanner.nextLine();
		
		//creating object and passing an argument for the Constructor 
		Olympics obj = new Olympics(athName);
		
		//Calling the methods
		obj.level(athEL);
		obj.sport(sport);
		obj.printMethod();
		
	}

}
