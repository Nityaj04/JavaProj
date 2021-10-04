package oops;

public class Phones {
	
	//Creating class variables
	public int phonePrice;
	public String phoneType;
	
	//Creating a default constructor
	public Phones(){
		System.out.println("This is a Nokia Phone");
	}
	//Creating a constructor
	public Phones(int p, String t) {
		//Object initialization
		phonePrice = p;
		phoneType = t;
	}

	public static void main(String[] args) {
		//Creating an object for constructors
		Phones phone = new Phones(1000, "touch Screen");		
		Phones defCons = new Phones();
		
		System.out.println("The price of the phone is: $ "+ phone.phonePrice);
		
	}

}
