package interfacenew;

import java.util.Scanner;

public class Test extends TD{
	

	public static void main(String[] args) {
		int balance = 0;
		String choice;
		do{
			Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your choice");
		choice = scanner.next();
		
		Test obj = new Test();
		
		switch(choice) {
		case "deposit":
			System.out.println("Enter the amount");
			int amount = scanner.nextInt();
			obj.deposit(balance,amount);
			break;
		case "withdraw":
			System.out.println("Enter the amount");
			int wdAmount = scanner.nextInt();
			obj.withdraw(balance,wdAmount);
			break;
		default:
			System.out.println("No option");
		}
		}
		
		while(choice != "no");	
	
		System.out.println("Thank you");
	}
	}
		

