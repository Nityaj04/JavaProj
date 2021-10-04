package practices;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		//counting vowels 
		/*int count=0;
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the word");
		String word = scn.next();
		
		word = word.toLowerCase();
		for(int i=0;i<word.length();i++)
			 {
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
				count++;
		}
		//Counting consonants
		int i=0;
		 if(word.charAt(i)>='a'&&word.charAt(i)<='z') {
			count++;
		}
		System.out.println(count);*/
		
		//predefined function from math library
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the number");
		int number = scn.nextInt();
		
		int result = Integer.signum(number);
		System.out.println(result);
		
	}
}
