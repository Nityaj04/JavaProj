package heirarinheritance;
   //This is subclass 2

public class Herbavor extends Dinosaur {
	//Creating private variable
		private String diet = "herbivor";

	public static void main(String[] args) {
		//Creating object
		Herbavor myObj = new Herbavor();
		
		//Calling superclass methods
		myObj.eatMethod();
		myObj.runMethod();
		myObj.dinoTypes();
		
	//Accessing super class variables
	System.out.println("The dinosaur is " + myObj.age+" years old ");
	System.out.println("It ate only " + myObj.eatingHabit);	
	
	//Accessing local variable
	System.out.println(myObj.diet);
	

	}

}
