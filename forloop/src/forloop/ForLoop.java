package forloop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		//Create a scanner object
		Scanner favNum = new Scanner (System.in);
		
		//Output prompt users for input
		System.out.println("Enter your number: ");
		
		//Create a variable and store the user input
		int number = favNum.nextInt();
		
			//For loop 
			for(int j=0; j<=number;j++) 
			{
				//print the number
				System.out.println(j);
			}
	}

}
