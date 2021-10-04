package firstexample;

import java.util.Scanner;

public class NewPractice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		System.out.println("Enter your number: ");
		System.out.println("Enter your name: ");
		
		
		int age=scanner1.nextInt();
		double number=scanner2.nextDouble();
		String name=scanner.nextLine();
		
	
		System.out.println("Your age is: "+age);
		System.out.println("Your number is: "+number);
		System.out.println("Your name is: "+name);
				
		

	}

}
