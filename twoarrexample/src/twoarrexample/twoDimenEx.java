package twoarrexample;

import java.util.Scanner;

public class twoDimenEx {
	
	public int max(int [] array) {
		int max = 0;
		for(int i=0; i<array.length; i++ ) 
		{
			if(array[i]>max) {
		
			max = array[i];
			
			}
		}
		return max;
	}
	
		public int min(int []array) {
		int min=array[0];
		for(int i = 0; i<array.length; i++ ) 
		{
			if(array[i]<min) {min = array[i];
		}
			
			
	}
	
		return min;
		}
		
		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the arraythat is to becreated::");
		int size = sc.nextInt();
		int[] myArray = new int[size];
		System.out.println("Enter the elements of thearray ::");
		for(int i=0; i<size; i++)
		{myArray[i] = sc.nextInt();
	
	/*ArrayM[] m = new ArrayM[5];
	System.out.println("Maximum value in the arrayis::"+m.max(myArray));
	System.out.println("Minimum value in the arrayis::"+m.min(myArray));*/
	
	int[] arrayM = new int[] {2, 3, 4, 5, 6};
	int tag = arrayM [2];
	}
		}
}
