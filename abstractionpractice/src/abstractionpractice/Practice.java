package abstractionpractice;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter the operator: ");
		char operator = scanner.next().charAt(0);
		
		int result;
		
		switch(operator) {
		case '+':
			result = num1+num2;
			System.out.println(num1+"+"+num2+"="+result);
			
			break;
		case '-':
			result = num1 - num2;
			System.out.println("The result is: "+ result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println("The result is: "+ result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println("The result is: "+ result);
			break;
		default:
			System.out.println("Wrong operator");
			
		}
		System.out.println();
	}
	

}
