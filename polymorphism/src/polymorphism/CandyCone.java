package polymorphism;

public class CandyCone extends Candy {
	public void hasSugar() {
		System.out.println("I have lots and lots of sugar, and I'm not even tasty");
	}
	
	public static void main(String[] args) {
		//MEthod overriding
		CandyCone c = new CandyCone();
		c.hasSugar();
		
		//upcasting
		Candy can = new CandyCone();
		can.hasSugar();
	}
}
