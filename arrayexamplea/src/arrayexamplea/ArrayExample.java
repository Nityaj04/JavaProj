package arrayexamplea;

public class ArrayExample {

	//Start of Main method 
	public static void main(String[] args) {
	
	//declaring an array
	String[] iceCreamFlavours = {"Black Cherry","Butter Scotch","Vanilla","Strawberry"};
	
	//printing favourite flavour
	System.out.println("This is my favourite flavour: "+ iceCreamFlavours[1]);
	
	
	System.out.println("These are the top picks of today: ");
	
	//for loop starts here to go through the array
	for(int i=0;i<iceCreamFlavours.length;i++) {
	
	////printing all flavours
	System.out.println("Flavour: " + iceCreamFlavours[i]);
		}

	}//main method ends

}
