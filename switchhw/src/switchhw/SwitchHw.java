package switchhw;
public class SwitchHw {
	
	//Method1 starts here
	static void method1(int age) {		
		
	//Start of switch statement
		switch(age) {
		case 10:
			System.out.println("You are a child");
			break;
		case 60:
			System.out.println("You are a senior");
			break;
		default:
			System.out.println("You are an infant");
		}//end of switch statement	
	}//Method1 ends here
	
	//Method2 starts here
	static void method2(String season) {
	String weather="winter";//creating a weather variable
	
	//Beginning of switch statement
		switch(season) {
		case "winter":
			System.out.println("Winter is here");
			break;
		case "fall":
			System.out.println("Fall is here");
			break;
		default:
			System.out.println("I love spring");
		}//End of switch statement
	
	}//Method2 ends here

	//main method
	public static void main(String[] args) {
		
	//method calls
		method1(60);
		method2("winter");
	}

}
