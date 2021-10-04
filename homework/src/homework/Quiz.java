package homework;

import java.util.Scanner;

public class Quiz {
	
	//Creating variables
	String name;
	int number;
	
	//Overloaded constructors
	public Quiz(String name, int number) {
		
		this.name = name;
		this.number = number;
		
		System.out.println("Welcome " + name + " " + number);		
	}
	
	//sports method to output sports
	public void sports() {
		String[] sportNames = {"Tennis", "Volley ball", "Soccer", "Hockey", "Baseball", "Golf"};
		for(int i = 0;i<sportNames.length;i++) {
			System.out.println(sportNames[i]);
		}
	}
	
	//places method to output places
	public void places() {
			String[] placeNames = {"Eiffel Tower", "Tajmahal", "China Wall", "Niagara Falls"};
			for(int i = 0;i<placeNames.length;i++) {
				System.out.println(placeNames[i]);
			}
	}
	
	//food method to output ice cream flavors
	public void food() {
		String[] icecream = {"Strawberry", "Cherry", "Lemon", "Butter Scotch"};
		for(int i = 0;i<icecream.length;i++) {
			System.out.println(icecream[i]);
		}
	}
	
	//Main method
	public static void main(String[] args) {
		
		//Creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Prompting users for input
		System.out.println("Enter your name: ");
		String nam = scanner.next();
		
		System.out.println("Enter your lucky number: ");
		int agee = scanner.nextInt();
		
		//Calling the constructor
		Quiz consObj = new Quiz(nam, agee);
		
		//Prompting to choose favorite topic
		System.out.println("Choose the one of the topics:");
		System.out.println("Sports\n" + "Travel\n" + "Science");
		String var = scanner.next();
		
		//Switch cases to select a topic
				switch(var) {
				case "sports":
					//calling sports method
					consObj.sports();
					
					//prompting questions and reading inputs
					System.out.println("Which is your favourite sport? ");
					String fav = scanner.next();	
					System.out.println("How often do you play this sport?");
					String spo = scanner.next();
					System.out.println("That keeps you fit!");
					break;
					
				case "travel":
					//calling places method
					consObj.places();
					
					//prompting questions and reading inputs
					System.out.println("Which is your favourite place? ");
					String fav1 = scanner.next();	
					System.out.println("How often do you visit this place?");
					String spo1 = scanner.next();
					System.out.println("Hope you enjoyed your visits!");
					break;
					
				case "science":
					//calling food method
					consObj.food();
					
					//prompting questions and reading inputs
					System.out.println("Which is your favourite icecream?");
					String fav2 = scanner.next();	
					System.out.println("How often do you eat icecream?");
					String spo2 = scanner.next();
					System.out.println("Hope you enjoyed it! ");
					break;		
				
				default:
					System.out.println("This is an irrelevant answer, try again!");
		}
			
	}
}
				


