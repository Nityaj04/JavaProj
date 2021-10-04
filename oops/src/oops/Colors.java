package oops;

public class Colors {
	
	public String name;
	public String hexCode;
	
	//Creating a constructor
	public Colors(String n, String j) {
		//Object initialization
		name = n;
		hexCode = j;
	}

	public Colors() {
		
	}
	public static void main(String[] args) {
		
		//Creating objects by passing arguments
		Colors blue = new Colors("blue","#0000FF");
		Colors red = new Colors("red","#FF0000");
	}

}
