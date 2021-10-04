package arrayinput;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		//Create a scanner object
		Scanner obj = new Scanner(System.in);
		
		//Prompt the user for input 
		System.out.println("Enter the size of the array: ");
		
		//Obtain the user input and store it in a variable
		int size = obj.nextInt();
		
		//Determining the number of elements in the array
		String[] myArray = new String[size];
		
		//Prompt the user for an input
		System.out.println("Enter the elements of the array");
		
		for(int i=0; i<size; i++) {
			myArray[i] = obj.next();
			
		             }
		
		//Printing the array values
		for(String name : myArray)
			System.out.println(name);
		}

}
