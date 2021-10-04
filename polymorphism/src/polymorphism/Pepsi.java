package polymorphism;

//subclass
public class Pepsi extends Coke {
	//subclass method
	public void hasSugar() {
		System.out.println("It tastes good!");
	}

	public static void main(String[] args) {
		//Method overriding / run time polymorphism
		Pepsi obj = new Pepsi();
		obj.hasSugar();
		
		//upcating
		Drinks objOne = new Coke();
		objOne.hasSugar();
		
		//upcasting
		Drinks objTwo = new Pepsi();
		objOne.hasSugar();
		

	}

}
