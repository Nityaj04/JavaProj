package practices;

import java.util.Arrays;

public class Array {
	
	//Creating a method to find whether a string is Palindrome
	public static void stringPalindrome(String string) {
		
		//Using stringbuilder class to reverse the string and return string output
		String reverseString = new StringBuilder(string).reverse().toString();
		
		//comparing the string with its reversed form
		if(string.toLowerCase().equals(reverseString.toLowerCase())) {
			System.out.println(string+" is a Palindrome word");
		}
		else
			System.out.println(string+" is not a Palindrome word");
	}
	//Creating a method to find whether a string is Palindrome using for loop
		public static void stringPalin(String string) {
			
			String reverse = "";
			
			//using for loop to traverse the string
			for(int i=string.length()-1;i>=0;i--) {
				
				//converting string to char
				reverse = reverse + string.charAt(i);
			}
			
			if(string.toLowerCase().equals(reverse.toLowerCase())) {
				System.out.println("You found a palindrome string: "+string);
			}
			else
				System.out.println("You did not find a palindrome string: "+string);
		}
	
	//Creating a method to find whether a number is Palindrome
	public static void numberPalindrome(int number) {
		int temp = number, reverseNumber = 0, remainder;
		remainder = temp%10;
		reverseNumber = reverseNumber*10+remainder;
		temp /=10;
		
		//Comparing the number and its reversed form
		if(number==reverseNumber) {
			System.out.println(number+" is a Palindrome number");
		}
		else
			System.out.println(number+" is not a Palindrome number");
	}
	
	public static void main(String[] args) {
		//Calling Methods and passing arguments
		stringPalindrome("Madam");
		numberPalindrome(2323);	
		stringPalin("Canada");
	}

}
		

	
	/*public static void poly() {
		String orgString = "Malayalam";
		 String reverseString = new StringBuilder(orgString).reverse().toString();
		 
		if(orgString.toLowerCase().equals(reverseString.toLowerCase())) {
			System.out.println("Polindrome");
		}
			else
				System.out.println("Not Polindrome");
		
	}
	
	public static void main(String[] args) {
		
		poly();
	int num = 33333;
	int num1= num;
	int rev = 0;
		
		while(num1!=0) {
			int Remainder = num1%10;
			rev = rev*10+Remainder;
			num1/=10;
		}
			if(num==rev) {
				System.out.println("Polyndrome");
			}
			else {
				System.out.println("Not Polyndrome");
			}
	}
	}

	/*public static void main(String[] args) {
		
		numberPoly();
		
		String poly = "121";
		String rev = "";
		
		for(int i = poly.length()-1;i>=0;i--) {
			rev=rev+poly.charAt(i);
		}
		if(poly.equals(rev)) {
			System.out.println("Polyndrome");
		}
			else 
				System.out.println("Not a Polyndrome");
			
		}		
	
}*/

	
		//declaring an array and giving values
		/*int[] intArray = {10, 20, 30, 40, 50};
		String[] stringArray = {"Science","Arts","Mathematics","Language","Health Science"};
		
		//Using array class to use the sort function
		Arrays.sort(stringArray);
		Arrays.sort(intArray);
		
		//Using array class to use toString function
		System.out.println(Arrays.toString(stringArray));
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j< stringArray.length; j++){
				System.out.println(stringArray[i]);
			}
		}*/
			
	

