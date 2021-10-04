package heirarinheritance;

//This is a superclass
public class Dinosaur {
	
		//Creating protected variables
		protected String eatingHabit = "Vegetables and Fruits";
		protected int age = 10000;
	
	//Creating eatmethod
	public void eatMethod() {
		System.out.println("It is a plant eater");
	}

	//Creating runmethod
	public void runMethod() {
		System.out.println("It runs faster than others");
	}
	
	public void dinoTypes() {
		  
		  //Creating switch cases
		String dinoName = "Stegosaurus";
		  
		  switch (dinoName) {
		  case "Triceratops":
		    System.out.println("Triceratops weighed 5000Kgs");
		    break;
		    
		  case "Stegosaurus":
		    System.out.println("Stegosaurus weighed 6000Kgs");
		    break;
		    
		  case "Velociraptor":
		    System.out.println("Velociraptor weighed 7000Kgs!");
		    break;
		    
		  case "Allosaurus":
		    System.out.println("Allosaurus weighed 8000Kgs");
		    break;
		    
		  case "Megalosaurus":
		    System.out.println("Megalosaurus weighed 10,000Kgs");
		    break;
		  
	  }

}
}
