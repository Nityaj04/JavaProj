package interfaceOne;

public class green implements Blue, Yellow {
	
	public void lemonYellow() {
		System.out.println("Yellow is my favourite color!");
	}
	public void skyBlue() {
		System.out.println("I like Blue color!");
	}

	public static void main(String[] args) {
		green myObj = new green();
		myObj.lemonYellow();
		myObj.skyBlue();

	}

}
