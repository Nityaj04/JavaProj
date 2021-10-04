package heirarinheritance;

//This is subclass 1
public class Trex extends Dinosaur {
	
	private String size = "Huge";

	public static void main(String[] args) {
		Trex myObj = new Trex();
		myObj.eatMethod();
		myObj.runMethod();
		
	System.out.println("The dinosaur is " + myObj.age+" old "+ "and had the eating habit of " + myObj.eatingHabit);	

	}

}
