package newproject;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		//Create a scanner object
		Scanner scanner = new Scanner(System.in);
		
		//prompt users for input
		System.out.println("Enter a number: ");
		
		//create a variable and store the input
		int num = scanner.nextInt();
		
		//beginning of for loop
		for(int i=0; i<num;i++) {
			System.out.println(i);
		}
		
	}

}
