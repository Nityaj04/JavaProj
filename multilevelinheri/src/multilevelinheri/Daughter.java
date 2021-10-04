package multilevelinheri;

//Subclass inherits from Mother
public class Daughter extends Mother {
	
	//Methods
	public void playWithTeddy() {
		System.out.println("I love my teddy");
	}
	
	public void eyeColor() {
		System.out.println("I have greenish eyes");
	}
	public static void main(String[] args) {
		
		//Creating object
		Daughter obj = new Daughter();
		
		//Method overridden
		obj.eyeColor();
		
		//Calling Mother class methods
		obj.givescookies();
		obj.givesFood();
		
		//Calling own method
		obj.playWithTeddy();

	}

}
