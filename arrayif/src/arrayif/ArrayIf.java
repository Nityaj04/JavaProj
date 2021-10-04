package arrayif;

import java.util.Arrays;

public class ArrayIf {//Beginning of the class

	public static void main(String[] args) {//Beginning of the main method
		
		//Declare an array
		int[] numbers = new int[5];
		
		//For loop to iterate through the array
		for(int i=0; i<numbers.length; i++) {
			
		//Generating random numbers
		int num = (int) (Math.random() * 10+1);
		
		if(num == 5 | num == 2) {
			i--;
			continue;
		}
		else
			numbers[i]=num;
		
		//Converting array values to a string form
		System.out.println(Arrays.toString(numbers));
		}

	}//End of the main method

}//End of the class
