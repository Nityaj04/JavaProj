package arrayexamplea;

import java.util.Scanner;

public class Bmo extends Bank {
	int previousBalance = 0;
	char option;
	
	public void interest(float interest, int amount) {
		interest = amount * interest /100;
		System.out.println("interest" + interest);
	}
	public void deposit(int amount) {
		amount = previousBalance+amount;
		System.out.println(amount);
		
	}
	
	public void withdraw(int amount) {
		
		amount = previousBalance-amount;
		System.out.println(amount);
	}
	public void options() {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("A: deposit");
		System.out.println("B: withdraw");
		
		do {
			System.out.println("Enter your option");
			char option = scanner.next().charAt(0);
					
		switch(option) {
		case 'A':
			System.out.println("Amount");
			int amount = scanner.nextInt();
			deposit(amount);
			break;
		case 'B':
			System.out.println("Amount to withdraw");
			int withdraw = scanner.nextInt();
			withdraw(withdraw);
			break;
				
		}
		}
		while(option != 'E');
		System.out.println("Thank you");
			}
	

		public static void main(String[] args) {
	
	Bmo obj = new Bmo();
	obj.options();
}
}

