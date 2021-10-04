package arrayexamplea;

public class ArrayMethodCall {//Beginning of class
	
	public static void printArray(String[] arrayFlavor) {//Beginning of the printArray method
		//print the statement
		System.out.println("Elements of the Array printed through method");
		
		//Enhanced for loop
		for(String flavor : arrayFlavor)
			System.out.println(flavor + "");
		System.out.println(arrayFlavor[0]);
	}//the printArray method

	public static void main(String[] args) {
		//Array declaration
		String[] arrayFlavor = {"Chocolate", "Strawberry", "Lemon"};
		
		//Calling the printArray method
		printArray(arrayFlavor);
		
	}

}//End of class
