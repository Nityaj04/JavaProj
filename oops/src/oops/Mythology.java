package oops;

public class Mythology {
	//creating a method for welcoming guests
	public void welcomeMessage() {
	
		//Printing the welcome message
		System.out.println("Welcome to Oasis!");
	}
	
	//Creating a method for cost
	public void entryCost(int cost) {
		
		//Printing the cost
		System.out.println("Admission cost is " + "$" + cost);
		
	}

	public static void main(String[] args) {
		//Creating an object 
		Mythology myObj = new Mythology();
		
		//Calling methods
		myObj.welcomeMessage();
		myObj.entryCost(100);		

	}

}
